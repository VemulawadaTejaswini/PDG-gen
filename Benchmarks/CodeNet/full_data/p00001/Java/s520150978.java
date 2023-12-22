import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, b;
    public static void main(String[] args) {
        while(read()){
            slove();
        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        a = sc.nextInt(); 
????????????b = sc.nextInt();
        return true;
    }

    static void slove(){
        int ans = Integer.toString(a+b).length();
        System.out.println(ans);
    }

}