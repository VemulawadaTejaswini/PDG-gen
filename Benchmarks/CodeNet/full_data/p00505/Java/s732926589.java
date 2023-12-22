import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int all = 0;
		int dn = 0;
		int tyo = 0;
		int ei = 0;
		
		while(sc.hasNext()){
			ArrayList<Integer> len = new ArrayList<Integer>(3);
			for(int i = 0; i < 3; i++){
				len.add(sc.nextInt());
			}
				
			Collections.sort(len, Collections.reverseOrder());
			
			if(len.get(0) >= len.get(1) + len.get(2)){
				System.out.println(all + " " + tyo + " " + ei + " " + dn);
				return;
			}
			
			all++;
			
			int a = len.get(0) * len.get(0);
			int bc = len.get(1) * len.get(1) + len.get(2) * len.get(2);
			
			if(a < bc){
				ei++;
			}else if(a > bc){
				dn++;
			}else{
				tyo++;
			}
		}
		
	}

}