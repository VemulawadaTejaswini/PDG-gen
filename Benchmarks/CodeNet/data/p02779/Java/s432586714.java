import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        boolean c = false;
        for(int i=0; i<a; i++) {
        	b[i] = sc.nextInt();
        	if(i == 0) {
        		continue;
        	}
        	for(int l=i-1; l>=0; l--) {
        		if(b[i] == b[l]) {
        			c = true;
        			break;
        		}
        	}
        	if(c == true) {
    			break;
    		}
        }
        if(c == true) {
        	System.out.println("NO");
        }else {
        	System.out.println("YES");
        }
	}
}