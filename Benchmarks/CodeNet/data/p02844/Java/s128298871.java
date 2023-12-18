public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        sc.useDelimiter("");
        char[] s = new char[N];
        String S = sc.next();
        s = S.toCharArray();

        Set<String> set = new HashSet<String>();

        String a = "";
        for (int i = 0; i < N; i++) {
            String tmp = a;
            a = a + s[i];
            for (int j = i; j < N; j++) {
                if (j == i) {
                    continue;
                }
                String tmp2 = a;
                a = a + s[j];
                for (int k = j; k < N; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    String tmp3 = a;
                    a = a + s[k];
                    System.out.println(a);
                    if (!set.contains(a)) {
                        set.add(a);
                    }
                    a = tmp3;
                }
                a = tmp2;
            }
            a = tmp;
        }
        System.out.println(set.size());
    }
}