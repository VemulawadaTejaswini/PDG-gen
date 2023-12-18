import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        long[] A = new long[Q+1];
        long[] B = new long[Q+1];
        for(int i=1;i<=Q;i++){
            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            A[i] = Math.min(num1,num2);
            B[i] = Math.max(num1,num2);
        }
        for(int i=1;i<=Q;i++){
            if(A[i]==B[i]){
                System.out.println(2*(A[i]-1));
                continue;
            }
            long ans1 = (A[i]-1)*2;
            long ans2 = 0;
            long upper = A[i]*B[i];
            if((upper-1)/A[i]>A[i]) ans2++;
            long left = A[i]+1;

            long right = upper/left;
            while(right>left){
                ans2 += 2;
                left += 1;
                right = A[i]*B[i]/left;
            }
            if(left==right&&left*right<upper) ans2++;
            System.out.println(ans1+ans2);
        }


    }
}


