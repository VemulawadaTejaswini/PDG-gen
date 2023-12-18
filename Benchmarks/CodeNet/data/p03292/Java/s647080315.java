import java.util.Scanner;
public class Main{
    
    public static int cost(int a,int b,int c){
        int cost = 0;
        cost = cost + Math.abs(b-a) + Math.abs(c-b);
        
        return(cost);   
    }

     public static void main(String []args){
         int A=0; int B=0;int C=0;
         Scanner in = new Scanner(System.in);
         A = Integer.parseInt(in.next());
         B = Integer.parseInt(in.next());
         C = Integer.parseInt(in.next());
         in.close();
        
        int[] costSum = new int[6];
        costSum[0] = cost(A,B,C);
        costSum[1] = cost(A,C,B);
        costSum[2] = cost(B,A,C);
        costSum[3] = cost(B,C,A);
        costSum[4] = cost(C,A,B);
        costSum[5] = cost(C,B,A);
         int min = costSum[0];
         for (int i=0;i<costSum.length;i++){
             if(min > costSum[i]){
                 min = costSum[i];
             }
         }
         System.out.println(min);
     }
}