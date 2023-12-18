import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++) {
            list[i]= sc.nextInt();
        }
        int c = 0;
        for (int i = 1; i < n-1; i++) {
            if( (list[i] > list[i-1] && list[i] < list[i+1]) ||
                    (list[i] < list[i-1] && list[i] > list[i+1]) ) {
                c++;
            }
        }
        

        System.out.println(c);   
        }
}
