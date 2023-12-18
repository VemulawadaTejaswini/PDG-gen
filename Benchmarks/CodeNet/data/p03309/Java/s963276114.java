import java.util.*;

public class Main {
    public static int ABS(int a){
        return (a>0)?a:-a;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int MINUS=0;
        int ANS=0;
        
        if(N%2==1){
            int CENTER=(N-1)/2;
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt()-i;
                if(i==CENTER) MINUS=A[i];
            }
            for(int i=0;i<N;i++){
                ANS+=ABS(A[i]-MINUS);
            }
        }else{
            int CENTER_BEF=(N-2)/2;
            int CENTER_AFT=N/2;
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt()-i;
                if(i==CENTER_BEF||i==CENTER_AFT) MINUS+=A[i]/2;
            }
            for(int i=0;i<N;i++){
                ANS+=ABS(A[i]-MINUS);
            }
        }
        
        System.out.println(ANS);
        
        
    }
}
