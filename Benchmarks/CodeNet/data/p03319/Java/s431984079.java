import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int left=0;
        int right=0;
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
            if(A[i]==1){
                if(i%2==0){
                    left = i;
                }else{
                    left = i+1;
                }
                if(N-i-1%2==0){
                    right = N-i-1;
                }else{
                    right = N-i;
                }
                break;
            }
        }
        
        int res = left/2 + right/2;
        

        
        System.out.println(res);
        }
    }