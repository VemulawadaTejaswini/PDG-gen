import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        int i, j;
        for(i=0; i<=n; i++){
            for(j=0; j<=n-i; j++){
                if(i*1000 + j*5000 + (n-i-j)*10000 == y){
                    System.out.print(n-i-j + " " + j + " " + i);
                    return;
                }
            }
        }
        
        System.out.print("-1 -1 -1");
	}
}