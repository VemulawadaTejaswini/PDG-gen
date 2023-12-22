import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<=N-1;i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<N-1;i++){
            for(int j=N-1;j>i;j--){
                if (a[j-1] > a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                    count++;
                }
            }
        }
        for(int i=0;i<N-1;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("%d",a[N-1]);
        System.out.printf("\n%d\n",count);
    }
}
