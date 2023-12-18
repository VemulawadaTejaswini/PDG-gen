import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        final Main main2 = new Main();
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
 
        final Map<Integer, List<A>> integerListMap = new HashMap<>();
 
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();
 
            integerListMap.computeIfAbsent(a, e -> new ArrayList<>())
                    .add(main2.new A(b, c % 2 == 0));
        }
 
        final int[] ints = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ints[i] = -1;
        }
 
        boolean first = true;
        for (Map.Entry<Integer, List<A>> integerListEntry : integerListMap.entrySet()) {
            if (first) {
                ints[integerListEntry.getKey()] = 0;
                first = false;
            }
 
            if (ints[integerListEntry.getKey()] == -1) {
                for (A a : integerListEntry.getValue()) {
                    if (ints[a.getD()] != -1) {
                        if (a.getL()) {
                            ints[integerListEntry.getKey()] = ints[a.getD()];
                        } else {
                            ints[integerListEntry.getKey()] = 1 - ints[a.getD()];
                        }
                        break;
                    }
                }
            }
 
            for (A a : integerListEntry.getValue()) {
                if(a.getL()){
                    ints[a.getD()] = ints[integerListEntry.getKey()];
                }else{
                    ints[a.getD()] = 1-ints[integerListEntry.getKey()];
                }
            }
        }
 
        for(int i = 1;i<n+1;i++){
            System.out.println(ints[i]);
        }
    }
 
    class A {
        private final int d;
        private final boolean l;
 
        A(int d, boolean l) {
            this.d = d;
            this.l = l;
        }
 
 
        public boolean getL() {
            return l;
        }
 
        public int getD() {
            return d;
        }
    }
}