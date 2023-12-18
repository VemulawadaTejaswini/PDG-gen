import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        
        if(a >=b)System.out.println("1");
        else if(a*a<b)System.out.println(0);   
        
       else { while(a<b){
            a=a+a ;
            count++;   
         } if(b%a!=0){
            count++;
         }
         
        
       System.out.println(count);
        }
      
    }
  
}
