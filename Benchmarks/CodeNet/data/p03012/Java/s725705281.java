import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]w = new int[n];
 
    int all = 0;
    for(int i=0; i<n; i++){
        w[i] = sc.nextInt();
        all += w[i];
    }
    int mae = 0;
    int cou = 0;
    for(int i=0; i<n; i++) {
    	if(mae*2 < all) {
    		mae += w[i];
    		cou++;
    	}
    }
    int A = all-mae-mae;
    A = Math.abs(A);
    int B = all-(mae-w[cou-1])-(mae-w[cou-1]);
    B = Math.abs(B);
    
    System.out.println(Math.min(A, B));
    }
}
