import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        ArrayList<Long> aList = new ArrayList<Long>();
        ArrayList<Long> bList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            bList.add(sc.nextLong());
        }
        sc.close();

        long sum = 0;
        for(long num : bList) {
            sum += num;
        }
        int j = m;
        int ans = 0;
        for(int i=0; i < n;i++){
            while(j > 0 && sum > k){
                j--;
                sum -= bList.get(j);
            }
            if(sum > k){break;}
            ans = i+j;
            sum += aList.get(i);
            
        }
        System.out.println(ans);
    }
}