import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        int n1=n/100;
        int n2=n%100;
        if(n2>n1*10+n1){
            System.out.println((n1+1)*100+(n1+1)*10+n1+1);    
        }else{
            System.out.println(n1*100+n1*10+n1);
        }
    
        
     }
}