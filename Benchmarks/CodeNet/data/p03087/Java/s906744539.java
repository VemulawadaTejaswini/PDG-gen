

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		
		
		for (int i=0; i<Q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int j=l;
			int count = 0;
	
		
			while (j<r){
				if (S.charAt(j-1)!='A'){
					j++;
				}
				else {
					if (S.charAt(j) =='C'){
						count++;
						j++;
					}
					else
						j++;
				}
			}
			System.out.println(count);
			
		}
		sc.close();
		

	}

}
