import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int t[] = new int[N];
        int total = 0;
        for(int i = 0; i <t.length; ++i){
            t[i] = sc.nextInt();
        }
        for(int i = 0; i <t.length; ++i){
            int num1 = t[i+1] - t[i];
        }
        total = Math.min(T, num1);
        System.out.println(total);
    }
}