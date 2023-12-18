import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;





public class Main {

	int Rows,Columns;
	Point start,goal;
	String[][] board;
	Boolean[][] checked;
	int[][] distancefromstart;
	static final String kabe="#";
	int masukazu;

	int countKabe;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		
		scanInputData();
		
		initializeChecked();
		initializeDistance();

		masukazu=Rows*Columns;



		int keiro=bfs();

		int result=masukazu-keiro-1-2;

		System.out.println(result);
	}



	void scanInputData()  {
//
		//String pathname="C:\\pleiades\\eclipse\\text\\atcoder.txt";

		//File file=new File(pathname);

		//Scanner scanner=new Scanner(file) ;

		Scanner scanner=new Scanner(System.in);

		Rows=scanner.nextInt();
		Columns=scanner.nextInt();


		start=new Point(0,0);

		int goaly=Rows-1;
		int goalx=Columns-1;

		goal=new Point(goaly,goalx);

		String buf="";

		board=new String[Rows][Columns];

		countKabe=0;

		for(int i=0;i<Rows;i++) {
			buf=scanner.next();

			for(int j=0;j<Columns;j++) {
				board[i][j]=buf.substring(j, j+1);

				if(board[i][j].equals(kabe)) {
						countKabe++;
				}
			}

		}


		scanner.close();
	}

	void initializeChecked() {
		checked=new Boolean[Rows][Columns];

		for(Boolean[] a:checked) {
			Arrays.fill(a,false);
		}


	}

	void initializeDistance() {
		distancefromstart=new int[Rows][Columns];

		for(int[] a:distancefromstart) {
			Arrays.fill(a,0);
		}
	}

	boolean isInvalidPoint(int nextY,int nextX) {

		boolean isOutOfBoard=nextY<0 || nextY>Rows-1 || nextX<0 || nextX>Columns-1;

		boolean isInWall=false;
		boolean hasReachedYet=false;

		if(!isOutOfBoard) {
			 isInWall=board[nextY][nextX].equals(kabe);
			 hasReachedYet=checked[nextY][nextX];
		}


		return isOutOfBoard || isInWall || hasReachedYet;

	}

	int bfs() {
		Queue<Point> nowq=new LinkedList<Point>();

		nowq.add(start);

		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};

		while(!nowq.isEmpty()) {

			Point tyakumokuPoint=nowq.poll();

			for(int j=0;j<4;j++) {

				//起点を中心に4方向に動いていく。
				int nextY=tyakumokuPoint.y+dy[j];
				int nextX=tyakumokuPoint.x+dx[j];

				//例外値だけ先に省いてしまう。動いた先が無効なら次へとばす。
				if(isInvalidPoint(nextY,nextX)) {
					continue;
				}

				//到達しましたよ。
				checked[nextY][nextX]=true;


				//距離の更新
				distancefromstart[nextY][nextX]=distancefromstart[tyakumokuPoint.y][tyakumokuPoint.x]+1;

				//進んだ先がゴールだったらmainに手数を返して探索終了
				if(nextY==goal.y && nextX==goal.x) {
					return distancefromstart[nextY][nextX];
				}

				nowq.add(new Point(nextY,nextX));
			}

		}

		return -1;

	}



}




class Point{

	int y;
	int x;

	Point(int y,int x){
		this.x=x;
		this.y=y;
	}

}
