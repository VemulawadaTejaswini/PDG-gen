import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       String num = sc.next();
       String n2=num.substring(num.length()-1,num.length());
       int n = Integer.parseInt(n2);

      
       if(n==2||n==4||n==5||n==7||n==9){
           System.out.println("hon");
       }else if(n==0||n==1||n==6||n==8){
           System.out.println("pon");
       }else if(n==3){
        System.out.println("bon");
       }

    }
}