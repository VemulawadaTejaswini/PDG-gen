import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        int N =sc.nextInt();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if(map.containsKey(a))
                map.put(a, map.get(a)+1);
            else
                map.put(a, 1);
                sc.close();
        }
        int count = 0;
        for(Integer key: map.keySet()){
            if(map.get(key) % 2 == 1)
                count++;
        }

        System.out.println(count);
    }
}