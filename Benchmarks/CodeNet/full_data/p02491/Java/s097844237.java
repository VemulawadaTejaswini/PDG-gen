import java.util.*;

public class AOJ10008 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int d = a / b;
        int r = a % b;
        float f = a / (float)b;
        System.out.println(d+" "+r+" "+f);
    }
}