import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		String[] inputArray = new String[n];
		char[] temp = new char[10];
		
		for (int i = 0; i < n; i ++) {
			temp = sc.next().toCharArray();
			Arrays.sort(temp);
			inputArray[i] = new String(temp);
		}
		
		Long result = 0L;
		
		for (int i = 0; i < n; i ++) {
			for (int j = i; j < n - 1; j ++) {
				if (inputArray[i].equals(inputArray[j + 1])) {
					result ++;
				}
			}
		}
		
		System.out.println(result);
  }
  
}