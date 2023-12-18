import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = 100*r+10*g+b;
        String ans = "NO";
        if(n%4==0) ans = "YES";
        System.out.println(ans);
    }
}
 