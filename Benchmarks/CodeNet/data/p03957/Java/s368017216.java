import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String x =sc.nextLine();
		
		char[] a = x.toCharArray();
		
		int p = 0, q = 0;
		
		for (int i = 0; i < a.length-1; i++){
			p++;
			if (a[i] == 'C'){
				break;
			}
		}
		
		for(int j = 0; j < a.length-1; j++){
			q++;
			if(a[j] == 'F'){
				break;
			}
		}
		
		if (p < q){
			System.out.println("Yes");
		}
		if (p > q){
			System.out.println("No");
		}
		
		sc.close();
	}
}
