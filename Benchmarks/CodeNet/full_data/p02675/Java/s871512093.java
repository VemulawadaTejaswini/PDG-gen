import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String N=input.next();
        int a=N.charAt(N.length()-1)-48;
        if(a==3){
        System.out.print("bon");
        }else if(a==0||a==1||a==6||a==8){
        System.out.print("pon");
        }else{
        System.out.print("hon");
        }
    }   
}