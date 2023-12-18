import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int inputs[] = new int[N];
		boolean isUsed[] = new boolean[N];
		for (int i = 0; i < N; i++) {
		    inputs[i] = sc.nextInt();
		    isUsed[i] = false;
		}
		Arrays.sort(inputs);
		
		int result = 0;
		for (int i= N - 1; 0 <= i; i--) {
		    for (int j = i - 1; 0 <= j; j--) {
		        if (isUsed[i] || isUsed[j]) {
		            continue;
		        }
		        int sum = inputs[i] + inputs[j];
	            if (isPower2(sum)) {
	                //System.out.println("i: " + i + ", j:" + j);
	                isUsed[i] = true;
	                isUsed[j] = true;
	                result++;
    		    }
		    }
		}
		System.out.println(result);
    }
    
    public static boolean isPower2(int number) {
        int tmpNumber = number;
        while (true) {
            if (tmpNumber == 1 || tmpNumber == 2) {
                return true;
            }
            
            if (tmpNumber % 2 != 0) {
                return false;
            }
            
            tmpNumber = tmpNumber / 2;
        }
    }
}