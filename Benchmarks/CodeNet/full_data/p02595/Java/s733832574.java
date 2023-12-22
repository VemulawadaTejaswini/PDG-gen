import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        HashSet<Long> hash = new HashSet<>();
        for (int i=0;i<n;i++){
            long x = sc.nextInt();
            long y = sc.nextInt();
            if (!hash.contains(x*753L+y*835L)){
                hash.add(x*563L+y*761L);
                if (Math.sqrt(x*x+y*y)<=d)ans++;
            }
        }
        System.out.println(ans);
    }
}
