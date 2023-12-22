
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Long K = scanner.nextLong();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        int next = A[0];
        int now = 1;
        int k = 1;
        int flag = 0;
        ArrayList list = new ArrayList();
        list.add(now);
        while (true){
            now = next;
            if(list.contains(now)){
                flag = now-1;
                break;
            }
            list.add(now);
            next = A[now-1];
            k++;
        }
        int count = 1;
        now = flag+1;
        next = A[flag];
        while (true){
            now=next;
            if(now==flag+1){
                break;
            }
            count++;
            next=A[now-1];
        }
        next = A[flag];
        now = flag+1;
        for(int i = 1; i <= (K-k)%count; i++){
            now = next;
            next = A[now-1];
        }
        System.out.print(now);
    }
}
