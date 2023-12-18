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
        boolean[][] f = new boolean[3][3];
        for(int i = 0; i < n; i++) {
        	int b = scan.nextInt();
        	for(int j = 0; j < 3; j++) {
        		for(int k = 0; k < 3; k++) {
        			if(a[j][k] == b)
        				f[j][k] = true;
        		}
        	}
        }
        for(int i = 0; i < 3; i++) {
        	boolean temp = true;
        	for(int j = 0; j < 3; j++) {
        		if(!f[i][j]) {
        			temp = false;
        			break;}
        	}
        	if(temp) {
        		System.out.println("Yes");
        		return;
        	}
        }
        for(int i = 0; i < 3; i++) {
        	boolean temp = true;
        	for(int j = 0; j < 3; j++) {
        		if(!f[j][i]) {
        			temp = false;
        			break;}
        	}
        	if(temp) {
        		System.out.println("Yes");
        		return;
        	}
        }
        boolean temp = true;
        for(int i = 0; i < 3; i++) {
        	if(!f[i][i]) {
        		temp = false;
        		break;
        	}
        }
        if(temp) {
        	System.out.println("Yes");
        	return;
        }

        temp = true;
        for(int i = 0; i < 3; i++) {
        	if(!f[i][2 - i]) {
        		temp = false;
        		break;
        	}
        }
        if(temp) {
        	System.out.println("Yes");
        	return;
        }

        System.out.println("No");
    }

}