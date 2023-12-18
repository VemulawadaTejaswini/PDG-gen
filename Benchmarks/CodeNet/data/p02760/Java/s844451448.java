import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 3; j++) {
        		a[i][j] = scan.nextInt();
        	}
        }
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
        	int b = scan.nextInt();
        	for(int j = 0; j < 3; j++) {
        		for(int k = 0; k < 3; k++) {
        			if(a[j][k] == b)
        				a[j][k] = 0;
        		}
        	}
        }

        for(int i = 0; i < 3; i++) {
        	boolean f = true;
        	for(int j = 0; j < 3; j++) {
        		if(a[i][j] != 0) {
        			f = false;
        			break;
        		}
        	}
        	if(f) {
        		System.out.println("Yes");
        		return;
        	}
        }

        for(int i = 0; i < 3; i++) {
        	boolean f = true;
        	for(int j = 0; j < 3; j++) {
        		if(a[j][i] != 0) {
        			f = false;
        			break;
        		}
        	}
        	if(f) {
        		System.out.println("Yes");
        		return;
        	}
        }

        for(int i = 0; i < 3; i++) {
        	boolean f = true;
        	if(a[i][i] != 0) {
        		f = false;
        		break;
        	}
        	if(f) {
        		System.out.println("Yes");
        		return;
        	}
        }

        for(int i = 0; i < 3; i++) {
        	boolean f = true;
        	if(a[i][2 - i] != 0) {
        		f = false;
        		break;
        	}
        	if(f) {
        		System.out.println("Yes");
        		return;
        	}
        }

        System.out.println("No");
    }

}