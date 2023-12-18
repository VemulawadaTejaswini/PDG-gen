import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<>(); 
        for(int i=0; i<N; i++){
            L.add(scanner.nextInt());
        }
        Collections.sort(L);
        //System.out.println(L);
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int a = L.get(i);
                int b = L.get(j);
                int res = find(L, j+1, a+b);
                //System.out.println(String.format("%d", res));
                count = count + res;
            }
        }
        System.out.println(count);
    }

    public static int find(List<Integer> li, int from, int target){
        int low = from;
        int upp = li.size() - 1;
        int mid = (upp-low+1)%2==0 ? (low+upp)/2+1 : (low+upp)/2 ;
        //System.out.println(String.format("%d, %d, %d", low, upp, target));
        if(upp-low < 0){
            return 0;
        }else if(li.get(from) >= target){
            return 0;
        }else if(li.get(upp) < target){
            return upp - low + 1;
        }
        while(upp - low > 1){ 
            //System.out.println(li.get(mid));
            if(li.get(mid) > target){
                upp = mid;
            }else{
                low = mid;
            }
            mid = (upp-low+1)%2==0 ? (low+upp)/2+1 : (low+upp)/2 ;
        }
        return low - from + 1;
    }
}