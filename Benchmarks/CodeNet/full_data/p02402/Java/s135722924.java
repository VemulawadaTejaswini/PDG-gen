import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
		int n = sc.nextInt();
		int max = 0;
		int min = 0;
		int total = 0;
		
		for (int i = 0; i < n; i++){
			int temp = sc.nextInt();
			if (temp > max){ max = temp;}
			if (temp < min){ min = temp;}
			total += temp;
		}
		System.out.printf("%d %d %d\n", min, max, total);
	}
}