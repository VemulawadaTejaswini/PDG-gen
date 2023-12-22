import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		IN:for(int i = 0; i < t; i++) {
			ArrayList<Integer> R = new ArrayList<Integer>();
			ArrayList<Integer> G = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();
			int[] list = new int[9];
			for(int j = 0; j < 9; j++) {
				list[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++) {
				String in = sc.next();
				if(in.equals("R")) R.add(list[j]);
				if(in.equals("G")) G.add(list[j]);
				if(in.equals("B")) B.add(list[j]);
			}
			int count = 0;
			boolean A1 = true;
			
			Collections.sort(R);
			Collections.sort(G);
			Collections.sort(B);
			for(int j = 0; j < R.size(); j++) {
				A1 = true;
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= R.size()) {
						A1 = false;
						break;
					}
					if(R.get(k) != R.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					R.remove(j);
					R.remove(j);
					R.remove(j);
					j -= 1;
					count++;
				}
			}
			
			for(int j = 0; j < G.size(); j++) {
				A1 = true;
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= G.size()) {
						A1 = false;
						break;
					}
					if(G.get(k) != G.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					G.remove(j);
					G.remove(j);
					G.remove(j);
					j -= 1;
					count++;
				}
			}
			
			for(int j = 0; j < B.size(); j++) {
				A1 = true;
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= B.size()) {
						A1 = false;
						break;
					}
					if(B.get(k) != B.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {

					j += 2;
					count++;
				}
			}
			for(int j = 0; j < R.size(); j++) {
				if(R.contains(R.get(j)+1) && R.contains(R.get(j) + 2)) {
					count++;
					R.remove(new Integer(R.get(j)+2));
					R.remove(new Integer(R.get(j)+1));
					R.remove(new Integer(R.get(j)));
					j = -1;
				}
			}
			for(int j = 0; j < G.size(); j++) {
				if(G.contains(G.get(j)+1) && G.contains(G.get(j) + 2)) {
					count++;
					G.remove(new Integer(G.get(j)+2));
					G.remove(new Integer(G.get(j)+1));
					G.remove(new Integer(G.get(j)));
					j = -1;
				}
			}
			for(int j = 0; j < B.size(); j++) {
				if(B.contains(B.get(j) + 1) && B.contains(B.get(j) + 2)) {
					count++;
					B.remove(new Integer(B.get(j)+2));
					B.remove(new Integer(B.get(j)+1));
					B.remove(new Integer(B.get(j)));
					j = -1;
				}
			}

			
			if(count == 3) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			
			
			
			
			
			
		}
	}
}