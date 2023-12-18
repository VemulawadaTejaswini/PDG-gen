import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        X=X-A;
        while(X>B){
            X=X-B;
            if(X<B){System.out.println(X);}
          
        }
        

        


    }
}
