import java.util.*;
class Main {
    public static void main(String[]$) {
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        long s=0,a=0;
        Map<Long,Long> m=new HashMap<>();
        m.put(s, 1l);
        while(n-->0){
            s+=c.nextLong();
            long k=m.containsKey(s)?m.get(s):0;
            m.put(s, k+1);
            a+=k;
        }
        System.out.println(a);
    }
}