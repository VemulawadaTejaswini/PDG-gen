import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        Map<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            cnt = Math.max(cnt,mp.get(a[i]));
            mp.put(b[i],mp.getOrDefault(b[i],0)+1);
            cnt = Math.max(cnt,mp.get(b[i]));
        }
        if(cnt>n) {
            System.out.println("No");
            return;
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[n-i-1] = b[i];
        }
        int l = -1, r = -1;
        for(int i=0;i<n;i++){
            if(a[i]==arr[i]){
                l = i;
                break;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(a[j]==arr[j]){
                r = j;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(l==-1||r==-1){

            for(int i=0;i<n;i++){
                sb.append(arr[i]);
                sb.append(" ");
            }
            String s = sb.toString().trim();
            System.out.println("Yes");
            System.out.println(s);
            return;
        }
        int lb = 0, rb = n-1;
        for(int j=0;j<l;j++){
            int v = arr[j];
            arr[j] = arr[l+j];
            arr[l+j] = v;
            lb = l+j;
            if(l+j==r){
                break;
            }
        }
        lb++;
        for(int j=r+1;j<n&&lb<=r;j++,lb++){
            int v = arr[lb];
            arr[lb] = arr[j];
            arr[j] = v;
        }
        sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        String s = sb.toString().trim();
        System.out.println("Yes");
        System.out.println(s);


    }
    static long cmp(int[] a, int[] b){
        return (long)Math.abs(a[0]-b[0])+(long)Math.abs(a[1]-b[1]);
    }
}