
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int m = scanner.nextInt();
       int k = scanner.nextInt();
        Queue<Integer> A = new LinkedList<>();
        Queue<Integer> B = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            A.add(a);
        }

        for (int i = 0; i < m; i++) {
            int b = scanner.nextInt();
            B.add(b);
        }
        int currVal = A.peek()<B.peek()?A.poll():B.poll();
        int ans = 0;
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
