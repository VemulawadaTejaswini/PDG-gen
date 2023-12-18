import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=2; i<=n; i++){
            map.put(i, scanner.nextInt());
        }
        scanner.close();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i=1; i<=n; i++){
            map2.put(i, 0);
        }
        for(int key: map.keySet()){
            map2.put(map.get(key), map2.get(map.get(key))+1);
        }
        for(int key: map2.keySet()){
            System.out.println(map2.get(key));
        }
    }
 
}