import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hashmap = new HashMap<>();
        make(hashmap);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (hashmap.get(a).equals(hashmap.get(b)) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static void make(HashMap<Integer, String> hashmap) {
        hashmap.put(1, "A");
        hashmap.put(3, "A");
        hashmap.put(5, "A");
        hashmap.put(7, "A");
        hashmap.put(8, "A");
        hashmap.put(10, "A");
        hashmap.put(12, "A");
        hashmap.put(4, "B");
        hashmap.put(6, "B");
        hashmap.put(9, "B");
        hashmap.put(11, "B");
        hashmap.put(2, "C");
    }
}