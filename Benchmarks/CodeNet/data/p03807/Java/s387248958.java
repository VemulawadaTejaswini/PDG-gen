import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int [N];
        int count = 0;
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < N;i++){
            if(a[i] % 2 == 1){
                count++;
            }
        }
        if(count % 2 == 1){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
