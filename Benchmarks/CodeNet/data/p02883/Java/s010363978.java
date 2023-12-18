import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long members[]= new long[N];
        long foods[] = new long[N];
        for (int i = 0; i <N ; i++) {
            long n = sc.nextLong();
            members[i] = n;
        }
        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            foods[i]= n;
        }
        Arrays.sort(members);
        Arrays.sort(foods);
        long left = 0;
        long right = (long)Math.pow(10, 12);
        while(left < right){
            long mid = (left + right) / 2;
            long shouldTrainingCount = 0;
            for (int i = 0; i < N ; i++) {
                shouldTrainingCount += Math.max(0, members[i] - (mid / foods[N - i -1]));
            }
            if(shouldTrainingCount <= K){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
