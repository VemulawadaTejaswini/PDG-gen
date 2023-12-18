import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int jude = 0;
        double sum = 0;
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        sum = sum / (4 * m);
//        System.out.println(sum);
        for(int i = 0; i<n; i++){
            if(sum <= a[i]){
                jude++;
            }
        }
        if(jude < m){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        sc.close();
    }
}