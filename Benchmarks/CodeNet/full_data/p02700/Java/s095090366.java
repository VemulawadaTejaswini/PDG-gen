import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = a/d;
        e+=(a%d==0)?0:1;
        int f = c/b;
        f+=(c%b==0)?0:1;
        String ans = (e<f)?"No":"Yes";
        System.out.println(ans);
    }
}
