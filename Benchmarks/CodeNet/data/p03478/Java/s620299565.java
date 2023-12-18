import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> num = new ArrayList<Integer>();
        int total = 0;
        for(int i = 1; i < N+1; i++){
            num.add(i);
        }
        for(int v:num){
            total += result(v,A,B);
        }
        System.out.println(total);
    }

    static int result(int x,int A,int B) {
        int ans = 0,max = 0,xx = x;
        while (x >= 1) {
            ans = x % 10;
            max += ans;
            x /= 10;
        }
        if (A <= max && B >= max) {
            return xx;
        }else{
            return 0;
        }
    }
}
