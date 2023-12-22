import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n==0) {
            System.out.print(x);
            return;
        }
        HashSet<Integer> set = new HashSet<>();

        int max = -1;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            set.add(num);
            max = Math.max(max, num);
        }

        int abs = max;
        int z = x;
        for(int i=1; i<=max*2; i++) {
            if(!set.contains(i)) {
                if (Math.abs(x-i)< abs) {
                    abs = Math.abs(x-i);
                    z = i;
                }
            }
        }
        System.out.print(z);
        return;
    }
}