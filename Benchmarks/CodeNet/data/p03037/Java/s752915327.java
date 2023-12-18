import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long[] a = {0,100001};
        for(long i=0;i<m;i++){
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if(a[0] < l){
                a[0] = l;
            }
            if(r < a[1]){
                a[1] = r;
            }
            if(r < a[0] || a[1] < l){
                System.out.println(0);
                break;
            }
        }
        sc.close();
        System.out.println(a[1]-a[0]+1);
    }
}