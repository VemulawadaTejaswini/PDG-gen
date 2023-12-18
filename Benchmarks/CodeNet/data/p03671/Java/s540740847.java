import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int ans = Math.min(a+b, a+c);
        ans = Math.min(ans, b+c);
        System.out.println(ans);
        sc.close();
    }
}