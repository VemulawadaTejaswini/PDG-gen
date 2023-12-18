import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
    
        if(a+b>c){
            System.out.println("No");
            return;
        }
        
        double left=(a+b-c)*(a+b-c);
        double right=4*a*b;
        
        if(left>right){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}