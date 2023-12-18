import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int X=sc.nextInt();
        Y=X-A;
        for(int i=0;Y<B;i++){
            Y=Y-B;
            if(Y<B){
                System.out.println(Y);
            }
          
        }
        

        


    }
}
