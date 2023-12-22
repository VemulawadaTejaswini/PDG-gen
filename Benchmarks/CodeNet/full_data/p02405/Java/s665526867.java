import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        int i=1;
        while(true){
        
            int H =sc.nextInt();
            int W =sc.nextInt();

        if(H==0 && W==0)break;
        for(int b=0;b<H;b++){
            int n=b;
           for(int a=0;a<W;a++){
            
            if(n%2==0)System.out.printf("#");
            else     System.out.printf(".");
            n++;
        }
        System.out.println();
        }
        System.out.println();
    }       
        sc.close();
   }
 
}
