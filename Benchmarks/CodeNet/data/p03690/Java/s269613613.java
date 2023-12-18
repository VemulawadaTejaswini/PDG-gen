import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        for(int i=0;i<N;++i)a[i] =scan.nextLong();
        for(int i=0;i<N;++i)b[i] =scan.nextLong();
        Map<Long,Integer> countmap = new HashMap<>();
        long x = 0;
        for(int i=0;i<N;++i)x^=a[i];
        countmap.put(x,1);
        for(int i=0;i<N;++i){
            if(!countmap.containsKey(a[i]))countmap.put(a[i],0);
            countmap.put(a[i], countmap.get(a[i])+1);
        }
        for(int i=0;i<N;++i){
            if(!countmap.containsKey(b[i]) || countmap.get(b[i])==0){
                System.out.println(-1);
                return;
            }
            countmap.put(b[i], countmap.get(b[i])-1);
        }
        Map<Long, Deque<Integer>> bNumToIndex = new HashMap<>();
        for(int i=0;i<N;++i){
            if(!bNumToIndex.containsKey(b[i]))bNumToIndex.put(b[i],new ArrayDeque<>());
            bNumToIndex.get(b[i]).add(i);
        }
        int ans =0;
        boolean used[] = new boolean[N];
        int index=0;
        while(true){
            int nextIndex=-1;
            if(bNumToIndex.containsKey(x)){
                nextIndex=bNumToIndex.get(x).poll();
                while(used[nextIndex] && !bNumToIndex.get(x).isEmpty()){
                    nextIndex = bNumToIndex.get(x).poll();
                }
                if(bNumToIndex.get(x).isEmpty())bNumToIndex.remove(x);
                if(used[nextIndex])nextIndex=-1;
            }
            if(nextIndex<0){
                while(index<N &&(used[index] || a[index]==b[index]))++index;
                if(index>=N)break;
                nextIndex=index;
                ++ans;
            }
            used[nextIndex]=true;
            if(x!=a[nextIndex]){
                ++ans;
                x=a[nextIndex];
            };
        }

        System.out.println(ans);


    }
}