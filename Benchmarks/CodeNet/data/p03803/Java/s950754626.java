import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashmap = new HashMap<>();
        make(hashmap);
        String alice = sc.next();
        String bob = sc.next();
        String winner = "";
        if (hashmap.get(alice) > hashmap.get(bob)) {
            winner = "Alice";
        } else if (hashmap.get(bob) > hashmap.get(alice)) {
            winner = "Bob";
        } else {
            winner = "Draw";
        }
        
        System.out.println(winner);
    }
    
    private static void make(HashMap<String, Integer> hashmap) {
        hashmap.put("2", 1);
        hashmap.put("3", 2);
        hashmap.put("4", 3);
        hashmap.put("5", 4);
        hashmap.put("6", 5);
        hashmap.put("7", 6);
        hashmap.put("8", 7);
        hashmap.put("9", 8);
        hashmap.put("10", 9);
        hashmap.put("11", 10);
        hashmap.put("12", 11);
        hashmap.put("13", 12);
        hashmap.put("1", 13);
    }
}
