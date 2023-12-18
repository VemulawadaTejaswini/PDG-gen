import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        int i = 0;
        for(i = 0; c < b; i++){
            c = a * i + a - i;
        }
        if(b == 1){
            System.out.println("0");
        }else if(a >= b){
            System.out.println("1");
        }else{
            System.out.println(i);
        }
    }
}