import java.awt.geom.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

import javax.naming.BinaryRefAddr;

public class Main {
	int k, ans;
	boolean [] used;
	
	private void dfs(int deep){
		if(deep == k){
			ans++;
		}
		
		for(int i = 0 ; i <k; i++){
			if(deep == i) continue;
			if(used[i] ) continue;
			used[i] = true;
			dfs(deep + 1);
			used[i] = false;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String []  s = sc.next().split("[\\+=]");
			BigInteger [] b = new BigInteger[s.length];
			boolean flg = true;
			for(int num = 0; num <= 9; num++){
				if(num == 0){
					boolean f = true;
					for(int i = 0 ; i < s.length; i++){
						if(s[i].length() > 1 && s[i].charAt(0) == 'X'){
							f = false;
							break;
						}
					}
					if(! f) continue;
				}
				
				for(int i = 0 ; i < s.length;i++){
					b[i] = new BigInteger(s[i].replaceAll("X", num + ""));
					long temp = Long.parseLong(s[i].replaceAll("X", num + ""));
				}
				if(b[2].compareTo(b[1].add(b[0])) == 0){
					System.out.println(num);
					flg = false;
					break;
				}
			}
			if(flg){
				System.out.println("NA");
			}
		}
	}
	public static void main(String [] args){
		new Main().doit();
	}
}