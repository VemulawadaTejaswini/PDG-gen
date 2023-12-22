import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve100();
	}

	public static void solve100(){
		Scanner sc = new Scanner(System.in);
		int E = 'E';
		int S = 'S';
		int W = 'W';
		int N = 'N';

		for(;;) {
			int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int x[] = new int[n];
            int y[] = new int[n];

            for(int i=0; i<n; i++) {
            	x[i] = sc.nextInt();
            	y[i] = sc.nextInt();
            }

            int m = sc.nextInt();

            int cx =10,cy=10;

            boolean[] visited = new boolean[n];

            for(int i=0; i<m; i++) {
            	int ch = sc.next().charAt(0);
            	int d = sc.nextInt();

    			for(int ii=0;ii<d;ii++){
    				if(ch == N) {
    					cy++;
    				}
    				if(ch == S) {
    					cy--;
    				}
    				if(ch == E) {
    					cx++;
    				}
    				if(ch == W) {
    					cx--;
    				}
    				for(int j=0;j<n;j++) {
    					if(cx==x[j]&&y[j]==cy) {
    						visited[j]=true;
    					}
    				}
    			}
	        }
            boolean ans = true;
            for(boolean v: visited){
                ans &= v;
            }
            System.out.println(ans?"Yes":"No");
		}
	}

}
