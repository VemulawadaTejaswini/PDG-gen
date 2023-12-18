import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>(max);
        for (int i = 0; i < max; i++) {
            map.put(sc.next(), sc.nextInt());
        }
        String music = sc.next();
        boolean hasSleep = false;
        int sum = 0;
        for (var entry : map.entrySet()) {
            if (hasSleep) {
                sum += entry.getValue();
            }
            if (entry.getKey().equals(music) && !hasSleep) {
                hasSleep = true;
            }
        }
        System.out.println(sum);
    }
}