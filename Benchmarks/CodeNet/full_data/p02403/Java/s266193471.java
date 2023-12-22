import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
      
        while(true){
        int H =sc.nextInt();
        int W =sc.nextInt();
        if(H==0 && W==0)break;
        while(H>0){
            for(int a=0;W>a;a++){
                System.out.print("#");
            }
            H--;
            System.out.println();
        }
      
        System.out.println();
    }
        sc.close();
   }
 
}
