import java.util.*;
import java.security.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		ArrayList<String> listA = new ArrayList<String>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		sc.next();
		sc.next();
		for(int i = 0; i < n-1; i++) {
			String[] tt = sc.next().split(":");
			int time1 = Integer.parseInt(tt[0]) * 60 + Integer.parseInt(tt[1]);
			String name1 = sc.next();
			tt = sc.next().split(":");
			int time2 = Integer.parseInt(tt[0]) * 60 + Integer.parseInt(tt[1]);
			String name2 = sc.next();
			if(time2 - time1 >= t) {
				listA.add(name1);
				listB.add(time2 - time1);
			}
		}
		sc.next();
		sc.next();
		System.out.println(listA.size());
		for(int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i) + " " + listB.get(i));
		}
	}
	
}