import java.util.*;

public class Main {

        public static class XlList {
        public long x;
        public long l;
    }
    public static class Compares implements Comparator<XlList> {
        @Override
        public int compare(XlList x1, XlList x2) {
            return x1.x < x2.x ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        long x = -1000000000;
        long l = 0;
        long remove = 0;
        ArrayList<XlList> alist = new ArrayList<XlList>();
        for(int i=0; i<n; i++) {
            long[] xl = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            XlList tmp = new XlList();
            tmp.x = xl[0];
            tmp.l = xl[1];
            alist.add(tmp);
        }
        Collections.sort(alist, new Compares());

        for(int i=0; i<n; i++) {
            if (i == 0) {
                x = alist.get(i).x;
                l = alist.get(i).l;
                continue;
            }
            long distance = alist.get(i).x - x;
            if (distance < alist.get(i).l + l) {
                remove++;
            }
            else {
                if (l > alist.get(i).l) {
                    x = alist.get(i).x;
                    l = alist.get(i).l;
                }
            }
        }
        System.out.println(n - remove);
    }
}