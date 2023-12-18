import java.util.Scanner;

// 7
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++)
        	for(int j = 0; j < 3; j++)
        		a[i][j] = sc.nextInt();
        int N = sc.nextInt();
        int[] b = new int[N];
        for(int i = 0; i < N; i++)
            b[i] = sc.nextInt();

        int count = 0;
        //if count >= 6 then break
        for(int i = 0; i < 3; i++)
        	for(int j = 0; j < 3; j++) {
        		for(int k = 0; k < N; k++) {
        			if(b[k] == a[i][j]) {
        				a[i][j] = -1;
        				++count;
        				if(count == 6) {
        					i = j = 10;
        					System.out.println("Yes");
        					break;
        				}
        			}
        		}
        	}
        
        String ans = "No";
        if(count < 6) {
        	for(int i = 0; i < 3; i++) 
        		if(a[i][0] == -1 && a[i][1] == -1 && a[i][2] == -1) {
        			ans = "Yes";
        			break;
        		}
        	for(int j = 0; j < 3; j++) 
        		if(a[0][j] == -1 && a[1][j] == -1 && a[2][j] == -1) {
        			ans = "Yes";
        			break;
        		}
        	
        	if(a[0][0] == -1 && a[1][1] == -1 && a[2][2] == -1) {
        		ans = "Yes"; 
        	}
        	if(a[2][0] == -1 && a[1][1] == -1 && a[0][2] == -1) {
        		ans = "Yes"; 
        	}
        	System.out.println(ans);
        }
    }

}
