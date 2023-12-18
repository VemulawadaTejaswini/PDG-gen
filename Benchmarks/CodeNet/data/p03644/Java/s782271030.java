import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        int c = 2;
        if(a == 1){
            c = 1;
        }
        while(b<a){
            b *= 2;
            if(b<=a){
                c = b;
            }
        }
        System.out.println(c);
    }
}