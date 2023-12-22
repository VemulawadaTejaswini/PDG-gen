import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new B().doIt();
    }
    class B{
    	int map[][];
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			int m = sc.nextInt();
    			int a = sc.nextInt();
    			if(n+m+a == 0)break;
    			map = new int [m+1][n+1];
    			for(int i = 0;i < m;i++){
    				int d = sc.nextInt();
    				int c1 = sc.nextInt();
    				int c2 = sc.nextInt();
    				map[d][c1] = c2;
    				map[d][c2] = c1;
    			}
    			for(int i = m;i > 0;i--){
    				if(map[i][a] != 0)a = map[i][a];
    			}
    			System.out.println(a);
    		}
    	}
    }
}