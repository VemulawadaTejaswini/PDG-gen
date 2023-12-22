import java.util.Scanner;

public class Main {
    public static int search(int l, int r,int[] S, int target){
        int mid = (l+r)/2;
        if(mid == l || mid == r){
            return -1;
        }
        else if(S[r] < target || S[l] > target){
            return -1;
        }
        else if(S[mid] == target){
            return 1;
        }
        else if(S[r] == target){
            return 1;
        }
        else if(S[l] == target){
            return 1;
        }
        else if(S[mid] < target){
            return search(mid, r, S, target);
        }
        else{
            return search(l, mid, S, target);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S[];
        int T[];
        int n = sc.nextInt();
        S = new int[n];
        for(int i = 0; i < n; i ++){
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        T = new int[q];
        for(int i = 0; i < q; i++){
            T[i] = sc.nextInt();
        }
        int num = 0;
        for(int i = 0; i < q; i++){
            if(search(0, n-1, S, T[i]) == 1){
                num++;
            }
        }
        System.out.println(num);
    }
}
