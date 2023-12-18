import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int num1=0;
        int temp1 = n;
        for(int i=n-1;i>=0;i--){
            if (a[i]==temp1){
                temp1--;
                num1++;
            }
        }
        int num2 = 0;
        int temp2=1;
        for(int i=0;i<n;i++){
            if (a[i]==temp2){
                temp2++;
                num2++;
            }
        }
        int num = num1>num2?num1:num2;
        int ans = n-num;
        System.out.println(ans);
    }
}
