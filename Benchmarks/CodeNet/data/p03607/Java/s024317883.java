import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) 
			list.add(sc.nextInt());
		Collections.sort(list);
		for(int i=1;i<=list.size()-1;i++) 
		{
			if(list.get(i)==list.get(i-1)) {list.remove(i);list.remove(i-1);i--;}
		}
		
		System.out.println(list.size());
	}

	
}
