import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String value = "";
		String valueSum = "";
		
		while(sc.hasNext()) {
			value = sc.nextLine();
			valueSum += value;			
		}
		
		int[] abc = {0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0};
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < valueSum.length(); i++) {
			Character x = valueSum.charAt(i);
			for(int j = 0; j < a.length(); j++) {
				if(x.equals(a.charAt(j)) || x.equals(A.charAt(j))) {
					abc[j]++;
				}
			}
		}
		
		for(int i = 0; i<a.length(); i++) {
			System.out.println(a.charAt(i)+" : "+abc[i]);
		}		
		sc.close();
	}
}
