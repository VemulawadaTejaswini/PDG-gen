import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N+1];
        int[] rec = new int[N+1];
        HashSet<Integer> dic = new HashSet<>();
        for(int i=1;i<=N;i++){
            A[i] = sc.nextInt();
            dic.add(A[i]);
            rec[A[i]]++;
        }
        int ans = 0;
        if(dic.size()<=K){
            System.out.println(ans);
            System.exit(0);
        }
        Arrays.sort(rec);
        int i=0;
        while(rec[i]==0) i++;
        for(int j=i;j<i+(dic.size()-K);j++){
            ans += rec[j];
        }
        System.out.println(ans);
    }
}