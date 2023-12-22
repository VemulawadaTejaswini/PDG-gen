import sun.java2d.xr.MutableInteger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Map<String, MutableInteger> map = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String str = scanner.next();
                if (!map.containsKey(str)) {
                    map.put(str, new MutableInteger(0));
                }
                MutableInteger integer = map.get(str);
                integer.setValue(integer.getValue() + 1);
            }
            String mostWord = map.entrySet().stream().max((o1, o2) -> new Integer(o1.getValue().getValue()).compareTo(o2.getValue().getValue())).get().getKey();
            String minWord  = map.entrySet().stream().min((o1, o2) -> new Integer(o1.getValue().getValue()).compareTo(o2.getValue().getValue())).get().getKey();
            System.out.printf("%s %s", mostWord, minWord);
        } catch (Exception e) {

        }
    }
}