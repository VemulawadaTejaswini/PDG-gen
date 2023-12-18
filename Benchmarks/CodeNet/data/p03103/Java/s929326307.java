
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer,Integer> energy = new HashMap<>();
        for(int i=0;i<n;i++){
            int tempA = sc.nextInt();
            int tempB = sc.nextInt();
            a[i]=tempA;
            if(energy.containsKey(tempA)){
                int temp = energy.get(tempA);
                energy.remove(tempA);
                energy.put(tempA,temp+tempB);
            }else{
                energy.put(tempA,tempB);
            }
        }
        Arrays.sort(a);
        long ans = 0;
        for(Integer value:a){
            int count = energy.get(value);
            for(int i=0;i<count;i++){
                m--;
                ans+=value;
                if(m==0){
                    System.out.println(ans);
                    return;
                }
            }
        }

    }
}
