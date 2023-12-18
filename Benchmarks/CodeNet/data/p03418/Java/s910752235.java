import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            int ret = 0;
            
            for(int i=k+1; i<=n; i++){

            	ret += (n/i) * (i-k) + Math.max(0, n%i - Math.max(k, 1) + 1);
            	
            }
            
            System.out.println(ret);
            sc.close();
		}
    }
	