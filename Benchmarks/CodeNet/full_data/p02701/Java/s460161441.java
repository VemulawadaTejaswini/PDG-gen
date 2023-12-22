import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
          String str = sc.nextLine();
          map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map.size());
    }
}
