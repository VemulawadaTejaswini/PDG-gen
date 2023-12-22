public class Main {
    private static int[] move = {1, -1, 4, -4};
    private static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        dsf();
        while (in.hasNext()) {
            String str = in.nextLine();
            str = str.replaceAll("\\s+", "");
            System.out.println(map.get(str));
        }
    }
    private static void dsf() {
        Queue<String> q = new LinkedList<>();
        map.put("01234567", 0);
        q.add("01234567");
        while (!q.isEmpty()) {
            String init = q.peek();
            q.poll();
            int p = 0;
            for (int i = 0; i < 8; i++) {
                if (init.charAt(i) == '0') {
                    p = i;
                    break;
                }
            }
            for (int i = 0; i < 4; i++) {
                int dx = p + move[i];   // ?????¢????¬??????????
                if (0 <= dx && dx < 8 &&
                        !(p == 3 && i == 0) && // ??????????????????????§?
                        !(p == 4 && i == 1)) { // ??????????????????????§?
                    String next = swap(init, p, dx);
                    if (!map.containsKey(next)) {
                        int val = map.get(init) + 1;
                        map.put(next, val);
                        q.add(next);
                    }
                }
            }
        }
    }
    private static String swap(String str, int init, int toChange) {
        char[] chars = str.toCharArray();
        char temp = chars[init];
        chars[init] = chars[toChange];
        chars[toChange] = temp;
        return new String(chars);
    }
}