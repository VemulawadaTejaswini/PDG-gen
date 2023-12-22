import java.util.*;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<A> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(new A(sc.nextInt(), sc.nextInt(), sc.next().charAt(0)));
        }
        long min = Long.MAX_VALUE;

        min = Math.min(min,
                       test(list,
                            (a, b) -> a.x - b.x,
                            a -> a.y,
                            a -> a.x,
                            'R', 'L' , 5));
        min = Math.min(min,
                       test(list,
                            (a, b) -> a.y - b.y,
                            a -> a.x,
                            a -> a.y,
                            'U', 'D' , 5));
        min = Math.min(min,
                       test(list,
                            (a, b) -> a.sum() - b.sum(),
                            a -> a.sub(),
                            a -> a.sum(),
                            'R', 'D' , 5));
        min = Math.min(min,
                       test(list,
                            (a, b) -> a.sum() - b.sum(),
                            a -> a.sub(),
                            a -> a.sum(),
                            'U', 'L' , 5));
        min = Math.min(min,
                       test(list,
                            (a, b) -> a.sub() - b.sub(),
                            a -> a.sum(),
                            a -> a.sub(),
                            'R', 'U' , 5));
        min = Math.min(min,
                       test(list,
                            (a, b) -> a.sub() - b.sub(),
                            a -> a.sum(),
                            a -> a.sub(),
                            'D', 'L' , 5));
        if(min == Long.MAX_VALUE) {
            System.out.println("SAFE");
        } else {
            System.out.println(min);
        }

    }

    static long test(List<A> list,
              Comparator<A> comparator,
              Function<A, Integer> keyFunc,
              Function<A, Integer> valueFunc,
              char forward,
              char backward, int mult) {
        long min = Long.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        list.sort(comparator);
        for(A a : list) {
            if(a.u == forward) {
                map.put(keyFunc.apply(a), valueFunc.apply(a));
            } else if(a.u == backward){
                if(map.containsKey(keyFunc.apply(a))) {
                    min = Math.min(min, (valueFunc.apply(a) - map.get(keyFunc.apply(a))) * mult);
                }
            }
        }
        return min;
    }



    static class A {

        int x;
        int y;
        char u;

        A(int x, int y, char u) {
            this.x = x;
            this.y = y;
            this.u = u;
        }

        int sum() {
            return x + y;
        }
        int sub() {
            return x - y;
        }
    }

}


