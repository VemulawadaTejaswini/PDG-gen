import java.util.Scanner;
 

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        
        int n = Integer.parseInt(lines[0]);
        int k = Integer.parseInt(lines[1]);

        line = sc.nextLine();
        String[] a = line.split(" ");
        
        int result = 0;
        for (int i = 0; i < n; i++) {
        	int total = 0;
        	for (int j = i; j < n; j++) {
        		total += Integer.parseInt(a[j]);
        		if (total % k == (j-i)) result++;
        	}
        }
        
        System.out.println(result);
        sc.close();
	}
	
}
