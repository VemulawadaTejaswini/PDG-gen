import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int ans = 0;
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){
                if(Math.abs((i+1)-(j+1)) == A[i]+A[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}