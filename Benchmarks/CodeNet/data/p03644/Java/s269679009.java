import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int maxCount = 0;
		
		int x = sc.nextInt();
		for (int i = x; i > 0; i--) {
		    int count = 0;
		    int num = i;
		    while (num % 2 == 0) {
		        count++;
		        num = num / 2;
		    }
		    
		    if (count > maxCount) {
		        maxCount = count;
		        result = i;
		    }
		}
		
		// output
		System.out.println(result);
	}
}