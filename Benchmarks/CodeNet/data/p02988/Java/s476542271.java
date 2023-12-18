import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
        }
        sc.close();
        int s = 0;
        for(int i = 0 ; i <= n - 3 ; i++ ){
            if(p[i] < p[i + 1] && p[i + 1] < p[i + 2]){
                s++;
            }else if(p[i + 2] < p[i + 1] && p[i + 1] < p[i]){
                s++;
            }
        }
        System.out.println(s);
    }
}