import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        sc.close();
        if(x >= y / 2){
            System.out.println(y / 2);
        }else{
            y -= x * 2;
            System.out.println(x + y / 4);
        }
    }
}