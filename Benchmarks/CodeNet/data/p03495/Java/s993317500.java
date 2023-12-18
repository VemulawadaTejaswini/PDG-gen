import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            if(map.get(A) != null){
                int old = map.get(A);
                map.put(A, old+1);
            }else{
                map.put(A,1);
            }
        }
        int s = map.size();
        if(s < K){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            nums.add(m.getValue());
        }
        Collections.sort(nums);

        int ans = 0;
        for(int i=0;i<s-K;i++){
            ans += nums.get(i);
        }
        System.out.println(ans);
    }
}