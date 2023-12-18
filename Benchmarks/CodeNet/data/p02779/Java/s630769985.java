import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n - 1 ; j++ ){
                if(a[j] > a[j + 1]){
                    int cha = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = cha;
                }
            }
        }
        int che = 0;
        for(int i = 0 ; i < n - 1 ; i++ ){
            if(a[i] == a[i + 1]){
                che = 1;
            }
        }
        if(che == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}