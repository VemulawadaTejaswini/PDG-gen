import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine().trim();
            if(hashMap.containsKey(s)){
                hashMap.put(s, hashMap.get(s)+1);
            }else{
                hashMap.put(s,1);
            }
        }

        pollMax(hashMap).forEach(System.out::println);
    }

    public static List<String> pollMax(HashMap<String, Integer> hashMap){
        Integer maxCount = hashMap.values().stream().max(Integer::compareTo).get();
        List<String> strings = hashMap.entrySet().stream().filter(entry -> entry.getValue().equals(maxCount))
                .map(Map.Entry::getKey).sorted().collect(Collectors.toList());
        return strings;
    }
}
