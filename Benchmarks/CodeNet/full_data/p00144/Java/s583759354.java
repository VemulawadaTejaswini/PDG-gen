import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// create graph from input
		int numRouter = Integer.parseInt(br.readLine());
		Router[] router = new Router[numRouter];
		String[] routerParameter = null;
		int routerId, numNextRouter;
		for (int i = 0; i < numRouter; i++) {
			routerParameter = br.readLine().split(" ");
			routerId = Integer.parseInt(routerParameter[0]);
			numNextRouter = Integer.parseInt(routerParameter[1]);
			int[] nextRouterId = null;
			if (numNextRouter != 0) {
				nextRouterId = new int[numNextRouter];
				for (int j = 0; j < nextRouterId.length; j++) {
					nextRouterId[j] = Integer.parseInt(routerParameter[2 + j]);
				}
			}
			router[i] = new Router(routerId, nextRouterId);
		}

		// solve
		Graph g = null;
		int numTask = Integer.parseInt(br.readLine());
		String[] packetData = null;
		for (int i = 0; i < numTask; i++) {
			// グラフ初期化
			g = new Graph(router);
			// パケット情報から最短経路長を出力
			packetData = br.readLine().split(" ");
			System.out.println(g.getCost(Integer.parseInt(packetData[0]), Integer.parseInt(packetData[1]),	Integer.parseInt(packetData[2])));
		}
	}
}

class Graph {
	private Router[] router;

	public Graph(Router[] router) {
		this.router = new Router[router.length];
		for (int i = 0; i < router.length; i++) {
			this.router[i] = new Router(router[i].getId(),
					router[i].getNextRouterId());
		}
	}

	public String getCost(int sourceRouterId, int targetRouterId, int TTL) {
		// 初期化
		int timeToLive = TTL;
		Router r = this.getRouter(sourceRouterId);
		Router sourceRouter = new Router(r.getId(), r.getNextRouterId());
		sourceRouter.setCostFromStart(1);
		
		@SuppressWarnings("unused")
		ArrayList<Router> presentRouterList = new ArrayList<Router>();
		presentRouterList.add(sourceRouter);
		@SuppressWarnings("unused")
		ArrayList<Router> nextRouterList = new ArrayList<Router>();

		// 全経路を探索
		while (--timeToLive > 0) {
			//基点から行ける点すべてについてコストを伝播させつつ、
			//その行ける点から行ける点を取得する
			for(int i = 0; i < presentRouterList.size(); i++){
				sourceRouter = presentRouterList.get(i);
				if (!sourceRouter.getPassed() && sourceRouter.getNextRouterId() != null){
					for (int id : sourceRouter.getNextRouterId()) {
						Router nextRouter = this.getRouter(id);
						nextRouter.updateCostFromStart(sourceRouter.getCostToNext(id));
						if(nextRouter.getId() != targetRouterId)
							nextRouterList.add(nextRouter);
					}
				}
				sourceRouter.setPassed(true);
			}
			
			if(nextRouterList.size() == 0)	break;
			
			//ルーターリストを更新
			presentRouterList.clear();
			for(int i = 0; i < nextRouterList.size(); i++){
				presentRouterList.add(nextRouterList.get(i));
			}
			nextRouterList.clear();
		};

		// targetRouterのcostFromStartを出力
		int cost = getRouter(targetRouterId).getCostFromStart();
		return (cost != Router.MAX_COST) ? String.valueOf(cost) : "NA";
	}

	private Router getRouter(int id) {
		for (Router r : this.router) {
			if (r.getId() == id)	return r;
		}
		return null;
	}
}

class Router {
	static final int WEIGHT = 1;
	static final int MAX_COST = 999999;
	static final int NO_ROUTE = -1;
	private int id;
	private int[] nextRouterId;
	private int costFromStart;
	private int[] weight;
	private boolean passed;

	public Router(int id, int[] nextRouterId) {
		this.id = id;
		this.nextRouterId = nextRouterId;
		if (nextRouterId != null) {
			this.weight = new int[nextRouterId.length];
			for (int i = 0; i < this.weight.length; i++) {
				this.weight[i] = WEIGHT;
			}
		}
		this.costFromStart = MAX_COST;
		this.passed = false;
	}

	public boolean updateCostFromStart(int cost) {
		if (cost != NO_ROUTE && cost < this.costFromStart){
			this.costFromStart = cost;
			return true;
		}
		return false;
	}
	
	public int getCostToNext(int id) {
		for (int i = 0; i < this.nextRouterId.length; i++) {
			if (this.nextRouterId[i] == id)		return this.costFromStart + this.weight[i];
		}
		return NO_ROUTE;
	}
	
	public int getId() {
		return this.id;
	}
	public int getCostFromStart() {
		return this.costFromStart;
	}
	public int[] getNextRouterId() {
		return this.nextRouterId;
	}
	public boolean getPassed(){
		return this.passed;
	}
	public void setCostFromStart(int costFromStart) {
		this.costFromStart = costFromStart;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
}