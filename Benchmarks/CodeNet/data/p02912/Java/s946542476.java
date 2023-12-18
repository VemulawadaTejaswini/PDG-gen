import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Double,Integer> a = new TreeMap<>();
        for (int i=0;i<n;i++){
            double pr = sc.nextDouble();
            if (a.containsKey(pr)) a.put(pr,a.get(pr)+1);
            else a.put(pr,1);
        }
        for (int i=0;i<m;i++){
            double pr = a.lastKey();
            int num = a.lastEntry().getValue();
            if (num<=1)a.pollLastEntry();
            else a.put(pr,a.get(pr)-1);
            if (!a.containsKey(pr/2.0)) a.put(pr/2.0,1);
            else a.put(pr/2.0,a.get(pr/2.0)+1);
        }
        long ans = 0;
        while (!a.isEmpty()){
            double pr = a.lastKey();
            int num = a.pollLastEntry().getValue();
            ans+=(long)(Math.floor(pr))*num;
        }
        System.out.println(ans);
    }
}
