import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String,Integer> map = HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(sc.next(),sc.nextInt());
        }

        Collections.sort(map);
        for(String x : map){
            System.out.println(x);
        }
    }
}