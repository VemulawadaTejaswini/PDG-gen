import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextLong());
        }
        Collections.sort(li);
        //Collections.sort(li,Comparator.reverseOrder());
        int[] li2 = new int[n];
        ArrayList<Change> changes = new ArrayList<Change>();
        for(int i = 0; i < m; i++){
            int count = sc.nextInt();
            long diff = sc.nextLong();
            changes.add(new Change(count,diff));
        }
        Collections.sort(changes);
        for(Change c : changes){
            int count = c.count;
            long diff = c.diff;
            int index = 0;
            while(diff > li.get(index) &&index <= n){
                if(li.get(index) < diff){
                    li2[index]++;
                    index++;
                }else{
                    break;
                }
            }
        }
        int now = 0;
        int index = 0;
        long prev = Integer.MAX_VALUE;
        for(Change c : changes){
            int count = c.count;
            long diff = c.diff;
            int rem = m-now;
            boolean second = false;
            while(index <= n && count > 0){
                if(prev <= li.get(index) && !second){
                    index = 0;
                    second = true;
                }else if(li2[index] >= rem){
                    li.set(index,diff);
                    index++;
                    count--;
                }else if(li2[2] < rem && second){
                    break;
                }else{
                    index = 0;
                    second = true;
                }
            }
            prev = diff;
            now++;
        }
        long ans = 0;
        for(long a : li){
            ans += a;
        }
        //System.out.println(li);
        System.out.println(ans);
    }
}

class Change implements Comparable<Change>{
    int count;
    long diff;
    public Change(int c, long d){
        this.count = c;
        this.diff = d;
    }
    public int compareTo(Change c){
        if(this.diff < c.diff){
            return -1;
        }else if(this.diff > c.diff){
            return 1;
        }
        return 0;
    }
}

