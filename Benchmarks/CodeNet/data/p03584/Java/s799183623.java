import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            long b = sc.nextLong();
            map.put(a,map.getOrDefault(a,0L)+b);
        }
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<31;i++){
            if((K&(1<<i))!=0) pos.add(i);
        }
        Collections.sort(pos,Collections.reverseOrder());
        long ans = 0;
        for(int w:map.keySet()){
            if(w<(1<<pos.get(0))) ans += map.get(w);
        }
        for(int high=0;high<pos.size()-1;high++){
            long cur = 0;
            int mask=0;
            for(int i=0;i<=high;i++) mask |= 1<<pos.get(i);
            mask += (1<<pos.get(high+1))-1;
            for(int w:map.keySet()){
                if((w|mask)==mask) cur+=map.get(w);
            }
            ans=Math.max(ans,cur);
        }
        long temp = 0;
        for(int w:map.keySet()){
            if((w|K)==K) temp += map.get(w);
        }
        ans = Math.max(ans,temp);
        System.out.println(ans);
    }
}
