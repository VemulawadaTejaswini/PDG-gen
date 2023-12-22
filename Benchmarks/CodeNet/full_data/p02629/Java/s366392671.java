import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        final long a = 26;
        System.out.println(convertTenRadixTo(a, n));
    }

    public static String convertTenRadixTo(long radix, long value) {

        List<Long> list = new ArrayList<>();
        if (radix == 0 || value == 0) {
            return "0";
        }

        while (value > 0) {
            if (value % radix == 0) {
                list.add(radix);
                value = (value / radix) -1;
            } else {
                list.add(value % radix);
                value = (value / radix);
            }
        }
        StringBuilder builder = new StringBuilder();

        for (long number : list) {
            builder.append(RADIX_MAP.get(String.valueOf(number)));
        }

        return builder.reverse().toString();
    }

    /**
     * 手抜きのMap
     */
    private static final Map<String, String> RADIX_MAP = new HashMap<String, String>() {
        {
            // put("", "a");
            put("1", "a");
            put("2", "b");
            put("3", "c");
            put("4", "d");
            put("5", "e");
            put("6", "f");
            put("7", "g");
            put("8", "h");
            put("9", "i");
            put("10", "j");
            put("11", "k");
            put("12", "l");
            put("13", "m");
            put("14", "n");
            put("15", "o");
            put("16", "p");
            put("17", "q");
            put("18", "r");
            put("19", "s");
            put("20", "t");
            put("21", "u");
            put("22", "v");
            put("23", "w");
            put("24", "x");
            put("25", "y");
            put("26", "z");
        }
    };
}