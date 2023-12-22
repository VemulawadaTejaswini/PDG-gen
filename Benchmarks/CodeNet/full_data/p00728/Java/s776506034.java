import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()) {
	    int n = scan.nextInt();

	    if (0 == n)
		break;
	    
	    int num = scan.nextInt();
	    int sum = num; 
	    int max = num;
	    int min = num;
	    for (int i=1; i<n; i++) {
		num = scan.nextInt();
		sum += num;

		if (num > max)
		    max = num;
		if (num < min)
		    min = num;
	    }
	    sum -= max;
	    sum -= min;
	    
	    System.out.println(sum/(n-2));
	}
    }


}