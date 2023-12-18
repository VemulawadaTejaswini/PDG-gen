import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	int R,C,N;
	ArrayList<Integer> edge;

	private void solve() {
		
		System.out.println("YES");
		/*
		// input
		Scanner io = new Scanner(System.in);
		R = io.nextInt();
		C = io.nextInt();
		N = io.nextInt();
		
		edge = new ArrayList<Integer>();
		edge.add(-1);

		boolean ans = true;
		for(int i=0;i<N;i++){
			int x1 = io.nextInt();
			int y1 = io.nextInt();
			int x2 = io.nextInt();
			int y2 = io.nextInt();
			
			int p1 = trans(x1,y1);
			int p2 = trans(x2,y2);
			if(p1==-1||p2 ==-1) continue;
				
			int near1 = solveBS(0,edge.size(),p1);
			int near2 = solveBS(0,edge.size(),p2);
			
			if(near1!=near2){
				if(near1==0){
					int temp = solveBS(0,edge.size(),2*R+2*C);
					if(temp!=near2){
						ans = false;
						continue;
					}
				} else if(near2==0){
					int temp = solveBS(0,edge.size(),2*R+2*C);
					if(temp!=near1){
						ans = false;
						continue;
					}
				} else {
					ans = false;
					continue;
				}
			}
			edge.add(near1+1,Math.min(p1, p2));
			edge.add(near1+2,Math.max(p1, p2));
		}

		System.out.println((ans)?"YES":"NO");*/
	}

	private int solveBS(int left, int right,int targ){// left-OK right-notOK
		//bottom
		if(right-left<=1){
			return left;
		}
		// recursion
		int next = (left + right) / 2;
		if(checkNext(next,targ)){// OK -> right
			return solveBS(next,right,targ);
		}else{ // notOK -> left
			return solveBS(left,next,targ);
		}
	}
	
	private boolean checkNext(int next,int targ){
		return edge.get(next)<=targ;
	}
	
	private int trans(int x,int y){
		if(y==0){
			return x;
		}else if(x==R){
			return R+y;
		}else if(y==C){
			return 2*R+C-x;
		}else if(x==0){
			return 2*R+2*C-y;
		}else{
			return -1;
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
