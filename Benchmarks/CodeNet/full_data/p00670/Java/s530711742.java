import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(), S = sc.nextInt();
            if(n==0 && S==0) break;

            PriorityQueue<Integer> q = new PriorityQueue<Integer>(10, new Comparator<Integer>(){
                    public int compare(Integer i1, Integer i2){
                        return (int) i2 - i1;
                    }
                });
            for(int i=0; i<n; i++) q.add(new Integer(sc.nextInt()));
            Integer[] rr = q.toArray(new Integer[0]);


            int cnt = 0;
            for(int i=0; i<rr.length; i++){
                int l = i, r = rr.length;
                while(l+1<r){
                    int mid = (l+r) / 2;
                    if(rr[i] + rr[mid]>S) l = mid;
                    else r = mid;
                }
                //System.out.println(i+" l: "+l+" r: "+r);
                cnt += l - i;
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}