
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
        	System.out.println("Hello World");
        }
        else{
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	System.out.println(a+b);
        }
    }
}