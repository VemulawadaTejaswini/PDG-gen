import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        Double sum = 0.0 , count = 0.0; 
        for(int  i = 0 ; i<n ; i++){
            a[i] =   sc.nextInt();
            sum += a[i];
            count++;
        }
        System.out.println(sum/count);
    }
}