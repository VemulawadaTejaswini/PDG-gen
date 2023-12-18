import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = (int) Math.pow(2.0,(double)N);
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = in.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if((j|A[i])!=A[i]) continue;
                if(A[j]>largest){
                    secondLargest = largest;
                    largest = A[j];
                }
                else if(A[j]>secondLargest&&A[j]<=largest){
                    secondLargest = A[j];
                }
            }
            int curSum = largest + secondLargest;
            ans = Math.max(curSum, ans);
            System.out.println(ans);
        }

    }

}