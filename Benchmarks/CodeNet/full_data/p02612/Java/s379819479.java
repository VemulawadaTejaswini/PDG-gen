import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b=a;
        int c =0;
        //6900
        while(true){
            if(a-1000>0){
                c++;
                a-=1000;
                
            }else if (a==0){
                System.out.println(c*1000);
                break;
            }//elseif
            else if(a-1000<=0){
          
                System.out.println((((++c)*1000))-b);
                break;
            }//elseif
        }//while
        
    }
}
