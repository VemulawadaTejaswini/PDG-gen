import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        int[] b = new int[n];
        for(int i=0;i<n+1;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        long monster = 0;
        for(int i=n-1;i>=0;i--){
            if(b[i] > a[i+1]){
                monster+=a[i+1];
                b[i]-=a[i+1];
                monster+=Math.min(a[i],b[i]);
                a[i]-=Math.min(a[i],b[i]);
            }else{
                monster+=b[i];
                a[i+1]-=b[i];
            }
        }
        System.out.println(monster);
    }
}
