import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        if(N%2==0){
            long ans = 0;
            long leftSum = 0, rightSum = 0;
            for(int i=0;i<N/2+1;i++){
                leftSum = 0;
                rightSum = 0;
                for(int x=0;x<i;x++) {
                    leftSum += a[x * 2];
                }
                for(int y=i;y<N/2;y++){
                    rightSum += a[y * 2 + 1];
                }
                if(leftSum + rightSum > ans){
                    ans = leftSum + rightSum;
                }
            }
            System.out.println(ans);
        }else{
            long ans = 0;
            long leftSum = 0, rightSum = 0, centerSum = 0;
            for(int i=0;i<N/2+1;i++){
                leftSum = 0;
                for (int x = 0; x < i; x++) {
                    leftSum += a[x * 2];
                }
                for(int j=i; j<N/2+1;j++) {
                    rightSum = 0;
                    centerSum = 0;
                    for (int y = j; y < N / 2; y++) {
                        rightSum += a[y * 2 + 2];
                    }
                    for (int z = i; z < j; z++){
                        centerSum += a[z * 2 + 1];
                    }
                    if (leftSum + rightSum + centerSum > ans) {
                        ans = leftSum + rightSum + centerSum;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
