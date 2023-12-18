import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int mn = 1000000000;
	
	for(int i = 0; i < n; i++) {
	    
	    int a = sc.nextInt();

	    int cnt = 0;
	    while(a % 2 == 0) {
		cnt++;
		a /= 2;
	    }

	    mn = Math.min(mn, cnt);
	}
	
	System.out.println(mn);
    }
    
}
