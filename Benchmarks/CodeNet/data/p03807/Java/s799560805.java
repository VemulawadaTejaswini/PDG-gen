import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int numo = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i] % 2 == 1){
                numo++;
            }
        }
		sc.close();
        if(numo % 2 == 0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	}
}
