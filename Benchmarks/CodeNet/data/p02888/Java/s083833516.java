import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        Set<Integer> ls = new HashSet<>();
        for(int i=0;i<N;i++){
            int L = sc.nextInt();
            ls.add(L);
        }
        int[] L = new int[ls.size()];
        int ind=0;
        for(int l:ls){
            L[ind] = l;
            ind++;
        }
        Arrays.sort(L);
        N = ls.size();
        int cnt=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                int k=j+1;
                while(k < N && L[k] < (L[i] + L[j])){
                    cnt++;
                    k++;
                }
            }
        }
        System.out.println(cnt);
    }
}

