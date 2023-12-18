import java.util.Scanner;

public class Main {
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int num=0;
        int temp = n;
        for(int i=n-1;i>=0;i--){
            if (a[i]==temp){
                temp--;
                num++;
            }
        }
        System.out.println(n-num);
    }

}
