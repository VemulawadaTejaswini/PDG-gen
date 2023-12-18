import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        
        int max = 0;
        for (int i = 1; i < N; i++) {
        	int overlapCount = 0;
        	String subStr = S.substring(i);
        	boolean[] memo = new boolean[26];
        	for(int j = 0; j < i; j++) {
        		char c = S.charAt(j);
        		boolean overlap = subStr.contains(String.valueOf(c));
        		if (overlap && !memo[(int)c - 97]) {
        			memo[(int)c - 97] = true;
        			overlapCount++;
        		}
        		
        		max = Math.max(max, overlapCount);
        	}
        }
        
        System.out.println(max);
    }
}
