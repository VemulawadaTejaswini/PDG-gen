import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] balls = new int[n+1];
        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            balls[a]++;
            set.add(a);
        }
        Arrays.sort(balls);
        int cnt = set.size();
        int ans = 0;
        //System.out.println(cnt);
        for(int i = balls.length-set.size(); i< balls.length-1; i++) {
            //System.out.println(i+" "+balls[i]);
            if(cnt>k) {
                ans += balls[i];
                cnt--;
            }else break;
        }
        System.out.println(ans);

    }
}
class Ball {
    int a,b;
    public Ball(int a, int b) {
        this.a = a;
        this.b = b;
    }
}