
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
        	a[i] = sc.nextInt();
        }
        int count = 0;

        for(int i=0;i<n-1;i++){
        	if(a[i] == a[i+1]){
        		count++;
        		i++;
        	}
        }
        System.out.println(count);
    }
}