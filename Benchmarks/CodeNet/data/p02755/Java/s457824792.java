import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = (int)Math.round(a/0.08);
        int d = (int)Math.round(b/0.1);
        if((int)Math.floor(d*0.08) == a){
            System.out.println(d);
        }else if((int)Math.floor(c*0.1) == b){
            System.out.println(c);
        }else{
            System.out.println(-1);
        }
    }
}
