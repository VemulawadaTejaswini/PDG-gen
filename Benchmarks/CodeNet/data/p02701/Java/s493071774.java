import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.next());
        }
        scanner.close();
        Map<String, Integer> map = new HashMap<>();
        for (String val : list) {
           map.put(val, 0);
        }
        System.out.println(map.size());
    }
 
}