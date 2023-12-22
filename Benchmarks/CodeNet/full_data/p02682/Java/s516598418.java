import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
          int c = sc.nextInt();
           int k = sc.nextInt();
           int sum=0;
           
           if(k-a==0){
               System.out.println(k);
               return;
           }
           
           /*while(true){
               for(int i=1;i<=b;i++){
                   sum= k-(a+1);
                   if(sum==0){
                       System.out.println(a);
                       return;
                   }
               }
*/
               int n=0;
               
                   for(int i=1;i<=c;i++){
                       sum = sum + 1;
                       n++;
                       if(sum==0){
                           System.out.println(a-(n));
                           return;
                       }
                   }
                    
    }
        
    }
    