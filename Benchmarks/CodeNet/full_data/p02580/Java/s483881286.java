import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Integer> hNum = new HashMap<>();
        Map<Integer, Integer> wNum = new HashMap<>();
        HashSet<Point> points = new HashSet<Point>();


        for (int i = 0; i < M; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            points.add(new Point(h,w));

            if (hNum.containsKey(h)) {
                hNum.put(h, hNum.get(h) + 1);
            } else {
                hNum.put(h, 1);
            }

            if (wNum.containsKey(w)) {
                wNum.put(w, wNum.get(w) + 1);
            } else {
                wNum.put(w, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> hs = hNum.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toList());
        List<Map.Entry<Integer, Integer>> ws = wNum.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toList());


        int hMax = hs.get(0).getValue();
        int wMax = ws.get(0).getValue();

        List<Map.Entry<Integer, Integer>> hsMax = hs.stream().filter(e -> e.getValue() == hMax).collect(Collectors.toList());
        List<Map.Entry<Integer, Integer>> wsMax = ws.stream().filter(e -> e.getValue() == wMax).collect(Collectors.toList());

        boolean on = true;
        for(Map.Entry<Integer, Integer> he : hsMax){
            for(Map.Entry<Integer, Integer> we : wsMax){
                Point p = new Point(he.getKey(), we.getKey());
                if(!points.contains(p)){
                    on = false;
                    break;
                }
            }
            if(!on){
                break;
            }
        }

        System.out.println(hMax + wMax - 1 + (on ? 0 : 1));
    }

    static class Point implements Comparable<Point> {
        int h;
        int w;

        Point(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Point o) {
            if (this.h > o.h) {
                return 1;
            } else if (this.h < o.h) {
                return -1;
            }
            return this.w - o.w;
        }

        @Override
        public boolean equals(Object o){
            if(!(o instanceof Point)){
                return false;
            }
            Point op = (Point)o;
            return (this.h == op.h) && (this.w == op.w);
        }

        @Override
        public int hashCode(){
            return h*31+w;
        }
    }
}
