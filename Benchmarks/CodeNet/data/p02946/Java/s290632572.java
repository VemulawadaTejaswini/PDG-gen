import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        int posi = X -(K-1);
        	for(int i=0;i<(K-1)*2+1;i++) {
        		System.out.print(posi);
        			if(i != ((K-1)*2+1)-1)
        				System.out.print(" ");
        		posi++;
        	}
        sc.close();
    }
}