import java.awt.geom.*;
import java.io.*;
import java.util.*;

import javax.naming.BinaryRefAddr;

public class Main {
	//2025 cording
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String []  s = sc.next().split("[\\+=]");
			boolean flg = true;
			for(int num = 0; num <= 9; num++){
				String [] work = Arrays.copyOf(s, s.length);
				for(int i = 0 ; i < work.length;i++){
					work[i] = work[i].replaceAll("X", num + "");
				}
				long sum = 0;
				for(int i = 0 ; i < work.length-1; i++){
					sum += Long.parseLong(work[i]);
				}
				if(sum == Long.parseLong(work[work.length - 1])){
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