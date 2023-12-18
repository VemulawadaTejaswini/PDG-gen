import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0; i < m; i++)
            a[stdIn.nextInt()] = -1;
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < n+1; i++){
            if(a[i] == -1){
                a[i] = 0;
            }else{
                a[i] = (a[i-1] + a[i-2]) % 1_000_000_007;
            }
        }
        System.out.println(a[n]);
   }
}