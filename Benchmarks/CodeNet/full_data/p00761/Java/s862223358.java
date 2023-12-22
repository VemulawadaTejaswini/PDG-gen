import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String num;
        int len;
        while(Integer.parseInt(num = scn.next()) > 0 | (len = scn.nextInt()) > 0) {
            Map<String, Integer> map = new HashMap<>();
            num = String.format("%0" + len + "d", Integer.parseInt(num));
            map.put(num, 0);
            int idx = 1;
            for(;;) {
                List<Character> list = new ArrayList<>();
                for(char elm : num.toCharArray()) {
                    list.add(elm);
                }

                Collections.sort(list);
                int min = characterListToInt(list);
                Collections.reverse(list);
                int max = characterListToInt(list);

                num = String.format("%0" + len + "d", max - min);
                Integer rslt;
                if((rslt = map.get(num)) == null) {
                    map.put(num, idx++);
                } else {
                    System.out.println(rslt + " " + Integer.parseInt(num) + " " + (idx - rslt));
                    break;
                }
            }
        }
    }

    private static int characterListToInt(List<Character> list) {
        StringBuilder sb = new StringBuilder();
        for(char elm : list) {
            sb.append(elm);
        }
        return Integer.parseInt(sb.toString());
    }
}