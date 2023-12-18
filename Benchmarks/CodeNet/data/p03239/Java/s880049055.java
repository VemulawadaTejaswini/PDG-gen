
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int t = sc.nextInt();
     	int[] c = new int[n];
     	int[] time = new int[n];
     	for(int i=0;i<n;i++){
     		c[i] = sc.nextInt();
     		time[i] = sc.nextInt();
     	}
     	int min = 1001;
     	for(int i=0;i<n;i++){
     		if(time[i]<=t){
     			min = Math.min(min, c[i]);
     		}
     	}

     	if(min==1001){
     		System.out.println("TLE");
     	}
     	else{
     		System.out.println(min);
     	}
    }
}