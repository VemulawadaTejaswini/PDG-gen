import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] a = new int[N];
                int cnt = 0;
                
                for(int i=0;i<N;i++){
                    a[i] = scan.nextInt();
                }
                for(int i=0;i<N;i=i+2){
                    if(a[i]%2==1){
                        cnt++;
                    }
                }
                
                
                System.out.println(cnt);
        }               
}