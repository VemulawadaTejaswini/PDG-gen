import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++)a[i]=sc.nextInt();
        int count = 0;
        int[] ANS = new int[n+1];
        HashSet<Integer> ans = new HashSet<>();
        for (int i=n;i>0;i--){
            if (2*i>n){
                if (a[i]==1){
                    count++;
                    ans.add(i);
                    ANS[i]=1;
                }else ANS[i]=0;
            } else {
                int ins = 2*i;
                int total = 0;
                while (ins<=n){
                    total+=ANS[ins];
                    ins+=i;
                }
                if (total%2!=a[i]){
                    count++;
                    ans.add(i);
                    ANS[i]=1;
                }else ANS[i]=0;
            }
        }
        System.out.println(count);
        for (int i : ans)System.out.print(i+" ");
        System.out.println();
    }
}
