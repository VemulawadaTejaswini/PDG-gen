import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        double ans=(a+b)/2;
        ans=Math.min(ans-Math.floor(ans),Math.ceil(ans)-ans);
        System.out.println(ans);
    }
}