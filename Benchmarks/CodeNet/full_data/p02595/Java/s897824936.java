import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       int N=scanner.nextInt();
       int D=scanner.nextInt();
       double A,K=0;
        long X,Y,XX,YY;
       int count=0;
       for(int i=0;i<N;i++){
            X=scanner.nextLong();
            Y=scanner.nextLong();
             XX=X*X;
             YY=Y*Y;
            A=Math.sqrt(XX+YY);
           if(A<=D){
               count++;
           }
       }
       System.out.println(count);
    }
}
