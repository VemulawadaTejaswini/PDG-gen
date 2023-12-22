import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] dis;
    int[][] nums = { {0, 1, 1, 1, 1, 1, 1},
		     {0, 0, 0, 0, 1, 1, 0},
		     {1, 0, 1, 1, 0, 1, 1},
		     {1, 0, 0, 1, 1, 1, 1},
		     {1, 1, 0, 0, 1, 1, 0},
		     {1, 1, 0, 1, 1, 0, 1},
		     {1, 1, 1, 1, 1, 0, 1},
		     {1, 1, 1, 1, 1, 1, 1},
		     {1, 1, 0, 1, 1, 1, 1}, };
    int n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==-1) break;
	    dis = new int[7];
	    for(int i=0; i<n; i++)	
		solve(sc.nextInt());
	}
    }

    void solve(int a){
	String ans = "";
	for(int i=0; i<dis.length; i++){
	    ans += dis[i]==nums[a][i] ? "0":"1";
	    dis[i] = nums[a][i];
	}
	System.out.println(ans);
    }
}