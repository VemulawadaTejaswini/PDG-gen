import java.util.*;


class Main {


    private static long search(char ich, char jch, char kch, Map<Character, ArrayList<Integer>> idx)
    {
        long sum = 0;
        for (Integer i : idx.get(ich)) {
            for (Integer j : idx.get(jch)) {
                if (i < j) {
                    for (Integer k : idx.get(kch)) {
                        if (j < k) {
                            if (j - i != k - j) {
                                sum++;
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        Map<Character, ArrayList<Integer>> idx = new HashMap<>();
        idx.put('R', new ArrayList<Integer>());
        idx.put('G', new ArrayList<Integer>());
        idx.put('B', new ArrayList<Integer>());

        for (int i = 0; i < N; i++) {
            idx.get(S[i]).add(i);
        }


        char[] set = { 'R', 'G', 'B'};
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            char ich = set[i];
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    char jch = set[j];
                    for (int k = 0; k < 3; k++) {
                        if (i != j && j != k && i != k) {
                            char kch = set[k];
                            //System.out.println(String.format("%c %c %c", ich, jch, kch));
                            sum += search(ich, jch, kch, idx);
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
