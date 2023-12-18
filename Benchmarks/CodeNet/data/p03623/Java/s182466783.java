import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(Math.abs(x-b) < Math.abs(x-a)){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        sc.close();
    }
}