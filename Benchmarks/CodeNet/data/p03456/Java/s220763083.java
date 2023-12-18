import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int x = Integer.parseInt(a+b);
        int s = 0;
        String str = "No";

        while(x > Math.pow(s, 2)){
            s++;
            if (x == Math.pow(s, 2)){
                str = "Yes";
            }
        }

        System.out.println(str);
    }
}