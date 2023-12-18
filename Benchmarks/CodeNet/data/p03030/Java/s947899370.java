import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> m = new TreeMap<String, Integer>();

        for(int i = 0; i < n; i++){
            m.put(sc.next(),sc.nextInt());
        }

        m.forEach((key,value) -> System.out.println(key + " " + value));
    }
}