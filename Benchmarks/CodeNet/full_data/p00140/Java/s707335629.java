import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

import java.util.Comparator;

class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int d[]={9,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9};

		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			int s =in.nextInt(), e = in.nextInt();
			ArrayList<String> al = new ArrayList<String>();
			for(int j = 0; j < d.length; j++){
				StringBuilder sb = new StringBuilder();
				if(d[j] == s){
					for(int k = j; k < d.length; k++){
						if(k != j) sb.append(" ");
						sb.append((char)('0' + d[k]));
						if(d[k] == e){
							al.add(sb.toString());
							break;
						}
					}
				}
			}
			Collections.sort(al, new Comp());
			System.out.println(al.get(0));
		}
	}
}

class Comp implements Comparator<String>{
	public int compare(String a, String b){
		int l1 = a.length(), l2 = b.length();
		if(l1 > l2) return 1;
		else if (l1 == l2) return 0;
		else return -1;
	}
}