import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    private static void Solve(){
        Scanner in = new Scanner(System.in);
        int a, b; a = in.nextInt(); b = in.nextInt();
        System.out.println(Math.max(a-(2*b), 0));
    }
    public static void main(String []args){
        Solve();
    }
}