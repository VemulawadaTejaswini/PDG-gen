import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        
        if(a%1000==0){
            System.out.println(a%1000);
        }else if (a%100==0){
            System.out.println(100);
        }else if (a%10==0){
            System.out.println(10);
        }else{
            System.out.println(1);
        }
        
    }
}
