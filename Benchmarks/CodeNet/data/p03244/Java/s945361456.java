import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
            if(i % 2 == 0) list1.add(v[i]);
            else list2.add(v[i]);
        }
        int maxFrec = 0;
        for(int value : list1){
            int cnt = 0;
            for(int comp : list1){
                if(value == comp) cnt++;
            }
            if(cnt > maxFrec) maxFrec = cnt;
        }
        int sum = list1.size() - maxFrec;
        maxFrec = 0;
        for(int value : list2){
            int cnt = 0;
            for(int comp : list2){
                if(value == comp) cnt++;
            }
            if(cnt > maxFrec) maxFrec = cnt;
        }
        sum += list2.size() - maxFrec;
        System.out.println(sum);
    }
}