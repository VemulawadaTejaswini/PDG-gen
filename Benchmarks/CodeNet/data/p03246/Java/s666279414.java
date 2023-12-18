import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        int ma = 0;
        int mb = 0;
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                a[i / 2] = scan.nextInt();
            }else{
                b[i / 2] = scan.nextInt();
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < n / 2 - 1; i++){
            if(a[i] != a[i + 1]){
                ma++;
            }else if(b[i] != b[i + 1]){
                mb++;
            }
        }
        if(Arrays.equals(a, b)){
            System.out.println(n / 2);
        }else{
            System.out.println(ma + mb);
        }
    }
}