import java.awt.geom.*;
import java.io.*;
import java.util.*;

import javax.naming.BinaryRefAddr;

public class Main {
	//2015 cording
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] data = new int[n];
			int max = n;
			for(int i = 0 ; i  < n; i++){
				data[i] = sc.nextInt();
				max = Math.max(max, data[i]);
			}
			
			int [] hash = new int[max + 1];
			int count = 0;
			while(true){
				Arrays.fill(hash, 0);
				for(int i = 0 ; i < n; i++){
					hash[data[i]]++;
				}
				
				boolean flg = false;
				for(int i = 0 ; i < n; i++){
					if(data[i] != hash[data[i]]){
						flg = true;
					}
					data[i] = hash[data[i]];
				}
				if(! flg){
					System.out.println(count);
					for(int i = 0 ; i < n-1; i++){
						System.out.print(data[i] + " ");
					}
					System.out.println(data[n-1]);
					break;
				}
				count++;
				
			}
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}