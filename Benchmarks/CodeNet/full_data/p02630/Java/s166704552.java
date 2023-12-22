import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] X = new int[100001];
                
                long ans = 0; 
                for(int i=1; i<=N; i++){
                    long A = scan.nextLong();
                    int P = (int) A;
                    X[P]++;
                    ans = ans + A;
                }
                
                int Q = scan.nextInt();
                for(int i=1; i<=Q; i++){
                    long B = scan.nextLong();
                    long C = scan.nextLong();
                    int BI = (int)B;
                    int CI = (int)C;
                    X[CI] = X[CI] + X[BI];
                    long E = (long)X[BI];
                    ans = ans - B*E + C*E;
                    X[BI] = 0;
                    
                    System.out.println(ans);
                }
        }               
}
