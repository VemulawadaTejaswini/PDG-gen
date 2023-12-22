import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        long ch = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            ch += a[i];
        }
        for(int i = 0; i < m; i++){
            b[i] = scan.nextInt();
            ch += b[i];
        }
        if(ch <= k){
            System.out.println(n + m);
            return;
        }
            int c = -1;
            int ia = 0;
            int ib = 0;
            long sum = 0;
        try{
            while(sum <= k){
                if(a[ia] <= a[ib]){
                    sum += a[ia];
                    ia++;
                    c++;
                }else{
                    sum += b[ib];
                    ib++;
                    c++;
                }
            }
        }catch(Exception e){
            if(ia >= a.length && ib < b.length){
                while(sum <= k){
                    sum += b[ib];
                    ib++;
                    c++;
                }
            }else if(ia < a.length && ib >= b.length){
                while(sum <= k){
                    sum += a[ia];
                    ia++;
                    c++;
                }
            }
        }
        System.out.println(ia < a.length && ib < b.length ? c : c + 1);
        scan.close();
    }
}
