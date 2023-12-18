import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        Collections.sort(ll);
        long ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int res = beamSearch(ll,ll.get(j)+ll.get(i));
                ans += Math.max(0,res-j);
            }
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(ArrayList<Integer> ll, int k){
        int left = -1;
        int right = ll.size();
        while(right - left > 1){
            int mid = (right + left) / 2;
            if(ll.get(mid) >= k){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }
}
