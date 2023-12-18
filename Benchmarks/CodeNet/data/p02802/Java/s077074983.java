import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, List<String>> map = new HashMap<>();
        
        for(int i=0; i<m; i++){
            int key = scanner.nextInt();
            if(map.containsKey(key)){
                map.get(key).add(scanner.next());
            }else{
                List<String> list = new ArrayList<>();
                list.add(scanner.next());
                map.put(key, list);
            }
        }

        scanner.close();
        int ac = 0;
        int wa = 0;

        for(int key : map.keySet()){
            if(!map.get(key).contains("AC")){
                continue;
            }
            for(String val : map.get(key)){
                if(val.equals("AC")){
                    ac += 1;
                    break;
                }
                wa += 1;
            }

        }
        System.out.print(ac + " " + wa);
    }
}