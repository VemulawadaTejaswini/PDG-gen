import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int q = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<q;i++){
            a[sc.nextInt()-1]++;
        }
        for(int i=0;i<n;i++){
            if(a[i]+k-q<=0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}