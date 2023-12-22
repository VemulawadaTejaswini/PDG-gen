import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       int N=scanner.nextInt();
       int D=scanner.nextInt();
       int count=0;
       for(int i=0;i<N;i++){
           int X=scanner.nextInt();
           int Y=scanner.nextInt();
           double A;
           A=(Math.sqrt(X*X+Y*Y));
           if(A>=D){
               count++;
           }
       }
       System.out.println(count);
    }
}
