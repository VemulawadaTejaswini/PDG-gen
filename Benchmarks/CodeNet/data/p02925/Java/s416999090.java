import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        ArrayDeque<Integer>[] a = new ArrayDeque[n];
        for(int i=0; i<n; i++){
            a[i] = new ArrayDeque<>();
            for(int j=0; j<n-1; j++){
                a[i].offer(Integer.parseInt(sc.next())-1);
            }
        }
        
        int[] step = new int[n];
        Arrays.fill(step, -1);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            q.add(a[i].peek());
        }
        
        int ans = 0;
        int cnt = 0;
        while(q.size()!=0){
            ArrayDeque<Integer> q2 = new ArrayDeque<>();
            while(q.size()!=0){
                int idx = q.poll();
                if(step[idx]<ans && !a[idx].isEmpty()){
                    int idx2 = a[idx].peek();
                    if(a[idx2].peek() == idx && step[idx2]<ans){
                        step[idx] = ans;
                        step[idx2] = ans;
                        q2.add(idx);
                        q2.add(idx2);
                        a[idx].poll();
                        a[idx2].poll();
                        cnt++;
                    }
                }
            }
            q = q2;
            ans++;
            if(cnt==n*(n-1)/2){
                break;
            }
        }
        
        if(cnt==n*(n-1)/2){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
