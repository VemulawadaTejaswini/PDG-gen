import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1131().doIt();
    }
    class aoj1131{
    	int result = 0;
    	int p,q,a,n;
    	void dfs(int split, int pp, int qq, int bai,int bo) {
            if(p * qq == q * pp){
                result++;
                return ;
            }
            if(split == n) return;
            if(p * qq < q * pp)return;
            for(int i = bo; i * bai <= a; i++){
                dfs(split + 1, qq * 1 + pp * i, qq * i, i * bai, i);
            }
        }
         void doIt(){
        	 while(true){
                 p = sc.nextInt();
                 q = sc.nextInt();
                 a = sc.nextInt();
                 n = sc.nextInt();
                 if(p + q + a + n == 0) break;
                 result = 0;
                 dfs(0,0,1,1,1);
                 System.out.println(result);
             }
         }
     }
}