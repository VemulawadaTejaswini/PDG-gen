import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] score = new int[n];
		int[] tmp  = new int[n];
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			tmp[i] = score[i];
		}
		Arrays.sort(tmp);
		ArrayList<Integer> leaders = new ArrayList<Integer>();  
		for(int i = 0; i < q; i++) {
			String in = sc.next();
			int a = sc.nextInt()-1;
			if(in.equals("ADD")) {
				leaders.add(score[a]);
			}
			else if(in.equals("REMOVE")) {
				for(int j = 0; j < leaders.size(); j++) {
					if(leaders.get(j).intValue() == score[a]) {
						leaders.remove(j);
						break;
					}
				}
			}
			else {
				int L = 0;
				int R = 1 << 28;
				int C = (L + R) / 2;
				while(L != R) {
					C = (L + R)/2;
					int count = 0;
					boolean[] al = new boolean[n];
					for(int j = 0; j < leaders.size(); j++) {
						int idR = Arrays.binarySearch(tmp, leaders.get(j).intValue());
						while(idR+1 < tmp.length && tmp[idR+1] == tmp[idR]) idR++;
						for(int k = idR; k >= 0; k--) {
							if(tmp[k] < tmp[idR] - C) break;
							if(al[k]) continue;
							al[k] = true;
							count++;
						}
					}
					if(n - count <= a+1) {
						R = C;
					}
					else {
						L = C+1;
					}	
				}
				
				System.out.println((R == 1 << 28)?"NA":R);
			}
		}
	}
}