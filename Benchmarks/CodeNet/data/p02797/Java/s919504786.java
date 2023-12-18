import java.util.*;

class Main {
    // 
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        if(s==1){
            for(int i = 0;i < k;i++){
                System.out.println("1 ");
            }
            return;
        }
        for(int i = 0;i < n;i++){
            if(count <= k){
                count++;
                if(i%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print(s-1 + " ");
                }
            } else {
                if(s == 1000000000){
                    System.out.println("999999 ");
                }else{
                    System.out.print("1000000000 ");
                }
            }
        }

    }
}

