import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int K = sc.nextInt();

        System.out.println( solve(s, K) );
    }

    private static String solve(String s, int K) {
        int k = K;
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            List<Integer> indice = findIndice(c, s);

            if( indice.isEmpty() ) continue;

            k -= 1;
            if( k == 0 ) {
                return "" + c;
            }

            Set<String> set = new HashSet<>();
            for (Integer index : indice) {
                set.addAll(findSub(s, index, k));
            }
            List<String> list = new ArrayList<>(set);
            list.sort(Comparator.naturalOrder());

            if( list.size() < k ) {
                k-= list.size();

            } else {
                return list.get(k - 1);
            }
        }
        throw new RuntimeException("oops");
    }

    private static List<String> findSub(String s, int index, int k) {
        List<String> strs = new ArrayList<>();

        int i = 2;
        while(true) {
            try {
                strs.add(s.substring(index, index + i));
                i++;
            } catch( Exception e ) {
                return strs;
            }

            if( strs.size() == k ) {
                return strs;
            }
        }
    }

    private static List<Integer> findIndice(int c, String s) {
        List<Integer> indice = new ArrayList<>();
        int index = 0;
        while(index != -1) {
            index = s.indexOf(c, index);
            if( index != -1 ) {
                indice.add( index );
                index ++;

            } else {
                break;
            }
        }
        return indice;
    }
}
