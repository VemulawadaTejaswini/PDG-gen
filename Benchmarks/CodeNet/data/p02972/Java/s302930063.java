import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++)a[i]=sc.nextInt();
        int count = 0;
        HashSet<Integer> ans = new HashSet<>();
        for (int i=n;i>0;i--){
            if (2*i>n){
                if (a[i]==1){
                    count++;
                    ans.add(i);
                }
            }
            else {
                if ((a[2*i]^a[i])==1){
                    count++;
                    ans.add(i);
                }
            }
        }
        System.out.println(count);
        for (int i : ans)System.out.print(i+" ");
        System.out.println();
    }
}
