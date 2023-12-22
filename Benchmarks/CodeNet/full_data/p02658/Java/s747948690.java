import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long tmp = 10;
        for(int i =0;i<18;i++){
            tmp *=10;
        }
        for(int i =0;i<n;i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 1;
        for(int i =0;i<n;i++){
            ans *= a[i];
            if(ans==0){
                break;
            }
            if(ans>tmp){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}