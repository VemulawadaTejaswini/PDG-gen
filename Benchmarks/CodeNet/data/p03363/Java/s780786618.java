import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{ 
        static int N;
        static int[] A;
        public static void main(String[] args){
                        /*入力受け取りここから*/
                        Scanner sc = new Scanner(System.in);
                        N = sc.nextInt();
                        A = new int[N];
                        for(int i=0; i<N; i++){
                                A[i]=sc.nextInt();
                        }
                        
                        /*入力受け取りここまで*/
                        Main app=new Main();
                        int count=0;
                        
                        for(int i=1; i<N; i++){//始まりの数をiとする
                                //for(int j=i; j<N; j++){
                                        int total=A[i-1];
                                        if(total==0){
                                                count=count+1;
                                        }
                                        //System.out.print("start:");
                                        //System.out.println(i-1);
                                        count=app.dp(count,total,i);
                                        //System.out.println();          
                                //}
                        }
                        System.out.println(count);
         
        }
        public int dp(int count,int total,int i){
                
                total=total+A[i];
                
                if(total==0){
                        count=count+1;
                }
                //System.out.println("count:"+count+" total:"+total+" i:"+i);
                if(i+1==N){
                        return count;
                }
                return dp(count, total, i+1);
        }
 
}