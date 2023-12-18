import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ruiseki = new int[N+1];


        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for (int i = 0; i < N ; i++) {
            int num = sc.nextInt();
            ruiseki[i+1] = ruiseki[i]+num;
            if(!m.containsKey(ruiseki[i+1])){
                m.put(ruiseki[i+1],1);
            }else{
                m.put(ruiseki[i+1],m.get(ruiseki[i+1])+1);
            }
        }
        long ans = 0;
        for (Map.Entry<Integer,Integer> e : m.entrySet()) {
            long n  = (long) e.getValue();
            if(n>1)
            ans += n *(n-1) /2;
        }


        System.out.println(ans);

    }
}