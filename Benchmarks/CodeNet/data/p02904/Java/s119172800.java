import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int[n];
        for (int i=0; i<n; i++) p[i] = sc.nextInt();

        int ans = 1;

        Set<Integer> set = new TreeSet<>();
        for (int i=0; i<n; i++){
            set.add(p[i]);
            if (i>=k){
                if (((TreeSet<Integer>) set).first()!=p[i-k] || ((TreeSet<Integer>) set).last()!=p[i]){
                    ans++;
                }
                set.remove(p[i-k]);
            }
        }

        int notChange = 0;

        int cnt = 1;

        for (int i=0; i<n-1; i++){
            if (p[i]<p[i+1]){
                cnt++;
                if (cnt==k){
                    notChange++;
                }
            }else {
                cnt = 1;
            }
        }

        if (notChange>=2){
            notChange -= 1;
        }else {
            notChange = 0;
        }
        System.out.println(ans-notChange);

    }
}