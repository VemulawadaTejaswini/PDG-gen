import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int sanka = sc.nextInt();
        int point = sc.nextInt();
        int seikai = sc.nextInt();
        int key = 1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < sanka; i++){
            map.put(key, point);
            key++;
        }
        for(int i = 0; i < seikai; i++){
            int ans = sc.nextInt();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                entry.setValue(entry.getValue() - 1);
                if(entry.getKey() == ans){
                    entry.setValue(entry.getValue() + 1);
                }
            }
        }
        for(int val : map.values()){
            if(val <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }     
}