import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int[] arr =new int[14];
        int N=obj1.nextInt();
        int sum=0;
        for (int i=N;i>0;i--) {
            for (int j=1;j<=N;j++){
                sum+=j%i;
            }
arr[i]=sum;
sum = 0;
        }
        System.out.print(arr[N]);
    }
}