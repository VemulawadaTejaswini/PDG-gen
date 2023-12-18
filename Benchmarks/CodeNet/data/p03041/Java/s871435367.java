        import java.util.*;
        public class Main{
          public static void main(String args[]){
            
            Scanner sc = new Scanner(System.in);
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            String x = sc.nextLine();
            String c = sc.nextLine();
            
            if(b == 0){
            System.out.println(c.substring(0,1).toLowerCase() + c.substring(1));
            }else if(b < a){
             System.out.println(c.substring(0,b) + c.substring(b,b+1).toLowerCase() + c.substring(b+1)); 
            }else{
              System.out.println(c.substring(0,b) + c.substring(b).toLowerCase());
            }
          }
        }