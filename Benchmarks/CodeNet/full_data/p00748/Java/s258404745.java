import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] arrs){
		
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> pollock = new ArrayList<Integer>();
		ArrayList<Integer> pollockk = new ArrayList<Integer>();

		int pollocknum = 0;
		int[] pollocktrue = new int[1000000 + 1];
		Arrays.fill(pollocktrue, Integer.MAX_VALUE/2);
		
		for(int i = 1; pollocknum <= 1000000 - 1; i++){
			if(pollocknum%2 != 0){
				pollocktrue[pollocknum] = 1;
				pollockk.add(pollocknum);
			}
			pollocknum = (i * (i + 1) * (i + 2)) / 6;
			pollock.add(pollocknum); 
		}
		
		for(int i = 0; i < pollockk.size();i++){
			for(int j = 0 ; j < pollocktrue.length; j++){
				if(j + pollockk.get(i) <= 1000000){
					pollocktrue[j + pollockk.get(i)] = Math.min(pollocktrue[j + pollockk.get(i)], pollocktrue[j] + 1); 
				}
			}
			
		}
		
		
		while(true){
			
			int n = sc.nextInt();
			
			ArrayList<Integer> pollock2 = new ArrayList<Integer>();
			ArrayList<Integer> pollock3 = new ArrayList<Integer>();
			ArrayList<Integer> pollock4 = new ArrayList<Integer>();
			

			if(pollock.contains((Integer)n)){
				System.out.println("1 " + pollocktrue[n]);
				continue;
			}
			pollocknum = 0;
			for(int i = 0; pollock.get(i) < n ;i++){
				//System.out.println(i);
				for(int j = i;  pollocknum <= n ;j++){
					//System.out.println(pollocknum);
					pollocknum = pollock.get(i) + pollock.get(j);
					pollock2.add(pollocknum);
				}
				pollocknum = 0;
			}
			if(pollock2.contains((Integer)n)){
				System.out.println("2 "+ pollocktrue[n]);
				continue;
			}
			pollocknum = 0;
			Collections.sort(pollock2);
			for(int i = 0; pollock.get(i) < n ;i++){
				for(int j = 0; pollocknum <= n;j++){
					pollocknum = pollock.get(i) + pollock2.get(j);
					pollock3.add(pollocknum);
				}
				pollocknum = 0;
			}
			pollocknum = 0;
			for(int i = 0; pollock2.get(i) < n ;i++){
				for(int j = 0; pollocknum <= n;j++){
					pollocknum = pollock2.get(i) + pollock.get(j);
					pollock3.add(pollocknum);
				}
				pollocknum = 0;
			}
			if(pollock3.contains((Integer)n)){
				System.out.println("3 "+ pollocktrue[n]);
				continue;
			}
			Collections.sort(pollock3);
			pollocknum = 0;
			for(int i = 0; pollock.get(i) < n ;i++){
				for(int j = 0; pollocknum <= 0 ;j++){
					pollocknum = pollock.get(i) + pollock3.get(j);
					pollock4.add(pollocknum);
				}
				pollocknum = 0;
			}
			pollocknum = 0;
			for(int i = 0; pollock2.get(i) < n ;i++){
				for(int j = i;  pollocknum <= n ;j++){
					pollocknum = pollock2.get(i) + pollock2.get(j);
					pollock4.add(pollocknum);
				}
				pollocknum = 0;
			}
			if(pollock4.contains((Integer)n)){
				System.out.println("4 "+ pollocktrue[n]);
				continue;
			}
			Collections.sort(pollock4);
			System.out.println("5 "+ pollocktrue[n]);
			
		}
		
	}

}