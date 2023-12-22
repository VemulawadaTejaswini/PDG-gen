import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ok = 0;

		for(int i=a; i<b+1; i++){
			if(i%k==0) {
				ok++;
			}
		}

		if (ok>0) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	    scan.close();	
    }
}