import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long x = scan.nextLong();
        long[] a = new long[N];
        for(int i=0;i<N;++i)a[i] = scan.nextLong();

        long ans = 0;
        for(int i=0;i<N;++i)ans += a[i];
        for(int i=1;i<N;++i){
            Deque<Integer> que = new ArrayDeque<>();
            long value=x*i;
            for(int index=0;index<i;++index){
                if(que.isEmpty()){
                    que.add(N-1-index);
                }else{
                    if(a[que.peek()] <= a[N-1-index])continue;
                    que.poll();
                    que.add(N-1-index);
                }
            }
            for(int j=0;j<N;++j){
                que.addLast(j);
                while(a[que.peekFirst()] > a[j] || j+(j<que.peekFirst() ? N:0) > que.peekFirst()+i ){
                    que.removeFirst();
                }
                value += a[que.peekFirst()];
        }
        ans = Math.min(ans, value);
        }
        System.out.println(ans);
    }
}