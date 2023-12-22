
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main (String[] args) {

     

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();



        int i = 0;
        while(i < n){
       
            String[] box = new String[4];

            int j = 0;
            while(true){
          
                String query1 = scan.next();

                box[j] = query1;
                if(box[0].equals("print") && box[2] != null){
      
                    break;
                }else if(box[0].equals("replace") && box[3] != null){
        
                    break;
                }else if(box[0].equals("reverse") && box[2] != null){
          
                    break;
                }
                j++;
            }
   

            int num1 = Integer.parseInt(box[1]);
            int num2 = Integer.parseInt(box[2]);

            switch(box[0]){
                case "print":
      
                    printA(str, num1, num2);
                    break;
                case "replace":
    
                    str = replace(str, num1, num2, box[3]);
                    break;
                case "reverse":
         
                    str = reverse(str, num1, num2);
           
                    break;
                default:

                    break;

            }

     
            i++;
        }


    }


    public static void printA(String x, int a, int z){
        System.out.println(x.substring(a,z+1));
    }

    public static String replace(String x, int a, int z, String st){
        String start = x.substring(0,a);
        String end = x.substring(z+1,x.length());
        return start + st + end;
    }

    public static String reverse(String x, int a, int z){
        String reverse = "";
    
        for(int i = z; i >= a; i--){
            reverse = reverse + x.substring(i,i+1);
        }
     
        return x.substring(0,a) + reverse + x.substring(z+1,x.length());
    }

  
}

