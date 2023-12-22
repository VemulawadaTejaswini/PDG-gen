import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        for(int i=0; i<N; i++){
            p[i]=sc.nextInt();
        }
        Arrays.sort(p);

        int res=X;
        for(int i=0; i<N; i++){
            if(p[i]<=X){
                res = X-p[i];
            }else{
                break;
            }
        }
        
         System.out.println(res);
        
    
        }
    }