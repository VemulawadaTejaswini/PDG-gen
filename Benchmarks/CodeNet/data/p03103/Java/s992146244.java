import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        long[] l = new long[1000000001]; 
        long ans  = 0;

        for(int i = 0;i < n;i++){
            int index = sc.nextInt();   //値段
            l[index] += sc.nextLong();
        }

        for(int i = 1;i < l.length && m > 0;i++){
            if(l[i] > 0){
                ans += (long)i * (long)Math.min(l[i],m);
                m -= Math.min(l[i],m); 
            }
        }

        System.out.println(ans);
    }
}
