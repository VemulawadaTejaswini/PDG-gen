import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer,List<Integer>> map2 = new HashMap<>();
        for(int i=1; i<=n; i++){
            map1.put(i, scanner.nextInt());
        }
        List<Integer> alist = new ArrayList<>();
        List<Integer> blist = new ArrayList<>();
        for(int i=0; i<m; i++){
            alist.add(scanner.nextInt());
            blist.add(scanner.nextInt());
        }
        scanner.close();
        for(int i=0; i<m; i++){
            map2.put(alist.get(i), new ArrayList<Integer>());
            map2.put(blist.get(i), new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++){
            map2.get(alist.get(i)).add(blist.get(i));
            map2.get(blist.get(i)).add(alist.get(i));
        }
        int count = 0;
        for (int val1 : map2.keySet()) {
            int tmp = 0;
            for (int val2 : map2.get(val1)) {
                if(map1.get(val1)<map1.get(val2)){
                    tmp = 1;
                }
            }
            if(tmp==0){
                count+=1; 
            }
        }
        System.out.println(count);
    }
 
}