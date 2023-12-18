import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> map = new HashMap<>();
        int a;
        for(int i = 0; i < n; i++){
            a = Integer.parseInt(sc.next());
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        
        if(map.size() == 1 && map.containsKey(0)){
            System.out.println("Yes");
        }else if(n%3 == 0){
            if(map.size() == 2 && map.getOrDefault(0, -1) == n/3){
                System.out.println("Yes");
            }else if(map.size() == 3){
                List<Integer> list = new ArrayList<>(map.keySet());
                int x = list.get(0) ^ list.get(1) ^ list.get(2);
                if(x == 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}