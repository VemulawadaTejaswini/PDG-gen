import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] val = new int[n];
        int max = 0;
        int cur = 0;
        for(int i = 0; i < n; i++){
            val[i] = Integer.parseInt(sc.next());
            if(i < k){
                cur += val[i];
            }else{
                cur = cur - val[i - k] + val[i];
                max = Math.max(cur, max);
            }
        }

        System.out.println((max + k) / 2.0);
    }
}