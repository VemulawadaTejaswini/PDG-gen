import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = -1;
        for(int i = 1; i <= n ; i++){
            if((i * (i-1) /2) == n){
                k = i;
                break;
            }
        }

        if(k == -1){
            System.out.println("NO");
            System.exit(0);
        }

        List<Integer>[] ans = new List[k];
        for(int i = 0; i < k;i++){
            ans[i] = new ArrayList<>();
        }
        int num = 1;
        for(int i = 0;i < k;i++){
            for(int j = i+1;j<k;j++){
                ans[i].add(num);
                ans[j].add(num);
                num++;
            }
        }


        System.out.println("YES");
        System.out.println(k);
        for(int i = 0; i < k;i++){
            System.out.print(ans[i].size() + " ");
            for(int j = 0;j < ans[i].size();j++){
                if(j != 0){
                    System.out.print(" ");
                }
                System.out.print(ans[i].get(j));
            }
            System.out.println("");
        }
    }
}