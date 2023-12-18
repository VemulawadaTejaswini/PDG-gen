import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> brokens = new ArrayList<Integer>();
        for(int i=0; i < M; i++){
            brokens.add(sc.nextInt());
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(brokens.contains(1) && brokens.contains(2)){
            ans.add(0);
            ans.add(0);
        }else if(brokens.contains(1)){
            ans.add(0);
            ans.add(1);
        }else if(brokens.contains(2)){
            ans.add(1);
            ans.add(0);
        }else {
            ans.add(1);
            ans.add(2);
        }

        for(int i=2; i<N; i++){
            if(brokens.contains(i) && brokens.contains(i-1)){
                ans.add(0);
            }else if (brokens.contains(i)){
                ans.add(ans.get(i-2));
            }else if (brokens.contains(i-1)){
                ans.add(ans.get(i-1));
            }else {
                ans.add(
                        ans.get(i-1)+ans.get(i-2)
                );
            }
            ans.set(i,ans.get(i)%1000000007);
        }
        if(ans.get(N-1).equals(0)){
            System.out.println(ans.get(N - 2));
        }else {
            System.out.println(ans.get(N - 1));
        }
    }
}
