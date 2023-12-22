import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long ans =1;
        for(int i =0;i<n;i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for(int i = 0;i<n;i++){
            ans *= a[i];
            if(ans==0){
                break;
            }
            if(String.valueOf(ans).length()>19){
                ans = -1;
                break;
            }
            if(String.valueOf(ans).length()==19&&ans%10>=1){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}