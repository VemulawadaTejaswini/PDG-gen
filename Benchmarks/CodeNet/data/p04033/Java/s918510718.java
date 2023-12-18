
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
        	int x = a;
        	a = b;
        	b = x;
        }
        if(a<=0 && b>=0){
        	System.out.println("Zero");
        }
        else if(a>0){
        	System.out.println("Positive");
        }
        else{
        	if((b-a)%2==0){
        		System.out.println("Negative");
        	}
        	else{
        		System.out.println("Positive");
        	}
        }
    }
}