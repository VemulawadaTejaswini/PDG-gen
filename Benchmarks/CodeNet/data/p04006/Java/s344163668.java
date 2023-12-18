import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		String[] str1 = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(str1[i]);
		}
		long cost = 0;
		BitSet bs = new BitSet(n);
		while(bs.cardinality()!=n){
			for(int i = 0; i < n; i++){
				if(!bs.get(i) && a[i]<=x){
				//System.out.println(cost+" "+a[i]);
					cost += a[i];
					bs.set(i);
				}
			}
			if(bs.cardinality()!=n){
				//System.out.println(cost+" "+x);
				cost += x;
				boolean b = bs.get(n-1);
				for(int i = n-1; i != 0; i--){
					//System.out.println("bs"+(i-1)+" is ");
					if(bs.get(i-1)){
						//System.out.println("true");
						bs.set(i);
					}else{
						//System.out.println("false");
						bs.set(i);
						bs.flip(i);
					}
				}
				if(b){
					bs.set(0);
				}else{
					bs.set(0);
					bs.flip(0);
				}
				/*
				for(int i = 0; i < n; i++){
					if(bs.get(i)){
						System.out.println(i+" true");
					}else{
						System.out.println(i+" false");
					}
				}
				*/
			}
		}
		sb.append(cost);
		System.out.println(sb);
	}
}