import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        long [] List = new long[N];
        for(int i=0;i<N;i++) List[i] = sc.nextInt();
        long min = List[0];
        long sum = 0;
        for(int i=1;i<N;i++){
            if(min!=List[i]) {
                long a, b;
                if (min > List[i]) {
                    a = min;
                    b = List[i];
                } else {
                    a = List[i];
                    b = min;
                }
                long r;
                while (a % b != 0) {
                    r = a % b;
                    a = b;
                    b = r;
                }
                min = (min * List[i]) / b;
            }
        }
        for(int i=0;i<N;i++){
            long now = min/List[i];
            sum = (sum+now)%1000000007;
        }
        System.out.println(sum);
    }
}