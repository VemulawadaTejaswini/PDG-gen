import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.inheritedChannel());

        int a=sc.nextInt();
        int b=sc.nextInt();

        if((a*b)%2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}