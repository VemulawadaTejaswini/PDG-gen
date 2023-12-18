import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        HashMap<Character, Integer> map = new HashMap<>();
        String str = strings[0];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 1; i < n; i++) {
            HashMap<Character, Integer> tempMap = new HashMap<>();
            str = strings[i];
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                tempMap.put(c, map.getOrDefault(c, 0) + 1);
            }
            HashSet<Character> removeKeys = new HashSet<>();
            for(Character character: map.keySet()) {
                int numChar = map.get(character);
                int tempNumChar = tempMap.getOrDefault(character, 0);
                int lessNum = Math.min(numChar, tempNumChar);
                if(lessNum == 0) removeKeys.add(character);
                else map.put(character, lessNum);
            }
            for(Character character: removeKeys) {
                map.remove(character);
            }
        }
        ArrayList<Character> answer = new ArrayList<>();
        for(Character character: map.keySet()) {
            for(int i = 0; i < map.get(character); i++) {
                answer.add(character);
            }
        }
        Collections.sort(answer);
        for(int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
        }
        System.out.println();
    }
}