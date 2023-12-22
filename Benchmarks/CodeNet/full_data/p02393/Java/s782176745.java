import java.util.Scanner;

public class Main {
	public void change() {

	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[3];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        int change = 0;
       if(n[0] > n[1]) {
    	   change = n[0];
    	   n[0] = n[1];
    	   n[1] = change;
       }
       if(n[1] > n[2]) {
    	   change = n[1];
    	   n[1] = n[2];
    	   n[2] = change;
       }
       if(n[0] > n[1]) {
    	   change = n[0];
    	   n[0] = n[1];
    	   n[1] = change;
       }
       System.out.printf("%d %d %d\n", n[0], n[1], n[2]);
    }
}
