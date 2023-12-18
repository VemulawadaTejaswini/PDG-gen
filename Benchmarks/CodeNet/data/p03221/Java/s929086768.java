public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, int[]> map = new HashMap<>();
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int[] array = new int[Integer.MAX_VALUE];
            map.put(i+1, array);
        }
        for(int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Pair(p, y));
            int[] a = map.get(p);
            a[y]++;
            map.put(p, a);
        }
        for(int i = 0; i < n; i++) {
            int num = 1;
            int[] a = map.get(i+1);
            for(int j = 0; j < a.length; j++) {
                if(a[j] == 1) {
                    a[j] = num;
                    num++;
                }
            }
        }
        for(Pair pair: list) {
            int p = pair.p;
            int y = pair.y;
            int order  = map.get(p)[y];
            System.out.println(String.format("%06d", p) + String.format("%06d", order));
        }
    }
    static class Pair {
        int p;
        int y;
        Pair(int p, int y) {
            this.p = p;
            this.y = y;
        }
    }
}

