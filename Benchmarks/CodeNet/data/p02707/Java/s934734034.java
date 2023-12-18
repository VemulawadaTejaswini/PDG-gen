import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        Map<Integer,Long> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            map.put(i,0l);
        }
        for(int val: list){
            map.put(val,map.get(val)+1);
        }
        for(int key: map.keySet()){
            System.out.println(map.get(key));
        }
    }

}