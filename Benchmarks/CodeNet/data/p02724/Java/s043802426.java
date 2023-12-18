import java.util.Scanner;
public class Main{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String []args){
        ans();
    }
    public static void ans(){
    int x=scn.nextInt();
    int a=(x/500 )*1000;
    int b=(x%500);
   
    System.out.print(a+b);

    
    }
}
  