import java.util.*;

public class Main{
    public static void main(String argv[]){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(Long.parseLong(scan.next()));
        }
        list.sort(Comparator.naturalOrder());
        
        for(int i = 0; i < m; i++){
            int b = Integer.parseInt(scan.next());
            long c = Long.parseLong(scan.next());
            int j;
            for(j = 0; j < b; j++){
                if(list.get(j) > c) break;
                list.set(j, c);
            }
            if(list.get(j) < c) list.sort(Comparator.naturalOrder());
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
