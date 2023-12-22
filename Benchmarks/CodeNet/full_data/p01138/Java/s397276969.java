import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[] d = new int[n];
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                String[] s1 = sc.next().split(":"); 
                String[] s2 = sc.next().split(":");
                String s = s1[0]+s1[1]+s1[2];
                d[i] = Integer.parseInt(s);
                s = s2[0]+s2[1]+s2[2];
                a[i] = Integer.parseInt(s);
            }

            for(int i=0; i<n; i++){
                int min = i;
                for(int j=i; j<n; j++){
                    if(d[min]>d[j]) min = j;
                }
                int tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
                tmp = d[min];
                d[min] = d[i];
                d[i] = tmp;
            }

            PriorityQueue<Integer> q  = new PriorityQueue<Integer>
                (n,new Comparator<Integer>(){
                    public int compare(Integer a, Integer b){
                        return a-b;
                    }
                });
            q.add(a[0]);
            int cnt = 1;
            for(int i=1; i<n; i++){
                if(q.peek()>d[i]) cnt++;
                else q.poll();
                q.add(a[i]);
            }

            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}