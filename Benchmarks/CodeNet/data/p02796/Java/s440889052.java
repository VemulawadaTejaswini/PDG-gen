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

        long x = 0;
        long l = -1000000000;
        int remove = 0;
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
            long distance = alist.get(i).x - x;
            if (distance < alist.get(i).l + l) {
                remove++;
            }
            else {
                x = alist.get(i).x;
                l = alist.get(i).l;
            }
        }
        System.out.println(n - remove);
    }
}