import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long Az[] = new long[N];
        long Bz[] = new long[M];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
            Bz[i] = sc.nextLong();
        }
        long sumA[] = new long[N];
        long sumB[] = new long[M];

        sumA[0] = Az[0];
        for (int i = 1; i < N; i++){
            sumA[i] = sumA[i - 1] + Az[i];
//            System.out.println(sumA[i]);
        }
        sumB[0] = Bz[0];
        for (int i = 1; i < M; i++){
            sumB[i] = sumB[i - 1] + Bz[i];
        }
//        for (int i = 0; i < M; i++){
//            System.out.println(sumB[i]);
//        }
//        int ret = 0;
//        ret = binarySearch(sumA, 300);
//        System.out.println(ret);

        int index = 0;
        long max = 0;
        long val = 0;
        int max_a = -1; int max_b = -1;
        for (int i = 0; i < N; i++){
            if (K < sumA[i]){
                continue;
            }
            index = binarySearch(sumB, K - sumA[i]);
//            System.out.println(index);
            val = sumA[i] + sumB[index];
//            System.out.println(index+" "+max+" "+val);
            if (max < val){
                max = val;
                max_a = i;
                max_b = index;
            }
        }
        System.out.println(max_a+max_b+2);

    }


    public static int binarySearch(long[] array, long target){
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        if (target > array[right]) {
            return right;
        }
        while (left < right){

            mid = (left + right) / 2;
//            System.out.println(left +" "+right+ " "+ mid+ " "+target);
            if ((array[mid] <= target) && (array[mid + 1] > target)){
//                System.out.println("aa");
                return mid;
            } else if (array[mid] < target){
                left = mid + 1;
            } else if (target < array[mid]){
                right = mid;
            }
//            break;
        }
        return right;
    }
}