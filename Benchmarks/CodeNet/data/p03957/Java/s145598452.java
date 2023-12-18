import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String x =sc.nextLine();
		
		char[] a = x.toCharArray();
		
		int p = 0, q = 0;
		
		for (int i = a.length-1; i > 0; i--){	
			if (a[i] == 'C'){
				break;
			}
			p++;
		}
		
		for(int j = a.length-1; j > 0; j--){
			if(a[j] == 'F'){
				break;
			}
			q++;
		}
		
		if (p > q){
			System.out.println("Yes");
		}
		if (p <= q){
			System.out.println("No");
		}
		
		sc.close();
	}
}
