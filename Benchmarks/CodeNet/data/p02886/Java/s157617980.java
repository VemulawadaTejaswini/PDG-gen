import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static class Set {
        int a,b;
        Set(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public boolean isSamePattern(int a, int b) {
            if (this.a == a) if (this.b == b) return true;
            if (this.a == b) if (this.b == a) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        ArrayList<Byte> Takoyaki = new ArrayList<>();
        readLine();
        for (String s : readLine().split(" ")) {
            Takoyaki.add(Byte.parseByte(s));
        }

        //Set, result
        LinkedHashMap<Set, Integer> Map = new LinkedHashMap<>();
        for (int index1 = 0; index1 < Takoyaki.size(); index1++) {
            for (int index2 = 0; index2 < Takoyaki.size(); index2++) {
                if (index1 == index2) continue;
                int Takoyaki1 = Takoyaki.get(index1);
                int Takoyaki2 = Takoyaki.get(index2);

                boolean flag = false;
                for (Set s : Map.keySet()) {
                    if (s.isSamePattern(index1, index2)) flag = true;
                }
                if (flag) continue;

                Map.put(new Set(index1, index2), Takoyaki1 * Takoyaki2);
            }
        }

        int result = 0;
        for (int i : Map.values()) result += i;
        Print(result);

    }

    private static final Scanner __in = new Scanner(System.in);
    private static String readLine() {
        return __in.nextLine();
    }

    private static void Print(int m) {
        System.out.println(m);
    }
}
