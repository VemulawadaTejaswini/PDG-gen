
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] list = new long[5];
        for(int i=0;i<5;i++){
        	list[i] = sc.nextLong();
        }
        Arrays.sort(list);
        
        if(n%list[0]==0){
        	System.out.println(n/list[0]+4);
        }
        else{
        	System.out.println(n/list[0]+5);
        }
    }
}