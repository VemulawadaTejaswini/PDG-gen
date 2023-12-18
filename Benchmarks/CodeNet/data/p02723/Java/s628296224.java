import java.util.Scanner;
public class Main{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String []args){
        ans();
    }
    public static void ans(){
        String str=scn.nextLine();
        if(str.length()<6)
        System.out.print("No");
        else{
            char ch1=str.charAt(2);
            char ch2=str.charAt(3);
            char ch3=str.charAt(4);
            char ch4=str.charAt(5);
            if(ch1==ch2 && ch3==ch4)
            System.out.print("Yes");
            else 
            System.out.print("No");
        }
    }
}
  