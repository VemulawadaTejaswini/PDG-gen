import java.util.*;

public class Main{
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[100000 + 1];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int q = sc.nextInt();
        int[] Key = new int[100000];
        for(int i = 0; i < q; i++){
            Key[i] = sc.nextInt();
            if(binarySearch(A, Key[i]) == 1){
                count++;
            }
        }
        System.out.println(count);

    }

    public static int binarySearch(int[] A, int Key){
        int left = 0;
        int right = A.length;
        int YesNo = 0;
        while(left < right){
            int mid = (int)Math.ceil((left + right)/2);
            if(Key > A[mid]){
                left = mid + 1;   //注意需要加一 因为是向下取整数
            }else if(Key == A[mid]){
                return 1;
            }else{
                right = mid;
            }
        }
        return YesNo;

    }
}

