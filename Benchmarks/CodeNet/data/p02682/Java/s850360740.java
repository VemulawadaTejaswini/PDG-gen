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
           int sum=0,count=0;
           while(count!=k){
               
               
              if(a>0){
                  sum+=1;
                  count++;
                  a--;
              }
              else if(b>0){
                  sum+=0;
                  count++;
                  b--;
              }
              else if(c>0){
             sum+=(-1);
             count++;
             c--;
           }
           }
           System.out.println(count);
    }
        
    }
    
