import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long n = scanner.nextLong();
       long m = scanner.nextLong();
       long k = scanner.nextLong();
        Queue<Long> A = new LinkedList<>();
        Queue<Long> B = new LinkedList<>();
        for (long i = 0; i < n; i++) {
            long a = scanner.nextInt();
            A.add(a);
        }

        for (long i = 0; i < m; i++) {
            long b = scanner.nextInt();
            B.add(b);
        }
        long currVal = A.peek()<B.peek()?A.poll():B.poll();
        long ans = 0;
        while(currVal<=k){
            ++ans;
            k-=currVal;
            if(!A.isEmpty() && !B.isEmpty()){
                currVal = A.peek()<B.peek()?A.poll():B.poll();
            }
            else if(!A.isEmpty() && B.isEmpty()){
                currVal = A.poll();
            }
            else if(A.isEmpty() && !B.isEmpty()){
                currVal = B.poll();
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
}
