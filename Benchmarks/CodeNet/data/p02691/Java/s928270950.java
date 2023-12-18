import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] A = new int[N+1];
                int cnt = 0;
                
                for(int i=1; i<=N;i++){
                    A[i] = scan.nextInt();
                }
                
                for(int i=1; i<N;i++){
                    for(int j=i+1; j<=N;j++){
                        if(j-i == A[j]+A[i]){
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
        }
}
