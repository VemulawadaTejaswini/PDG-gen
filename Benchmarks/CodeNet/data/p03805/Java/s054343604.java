import java.util.*;

public class Main {

    static int COUNT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> routes = new HashMap<>();
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            new ArrayList<Integer>();
            if(routes.containsKey(a)) {
                ArrayList<Integer> list = routes.get(a);
                list.add(b);
                routes.put(a, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(b);
                routes.put(a, list);
            }
            if(routes.containsKey(b)) {
                ArrayList<Integer> list = routes.get(b);
                list.add(a);
                routes.put(b, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                routes.put(b, list);
            }
        }
        boolean[] isVisited = new boolean[n];
        countRoutes(routes, isVisited, 0);
        System.out.println(COUNT);
    }

    static void countRoutes(HashMap<Integer, ArrayList<Integer>> routes, boolean[] isVisited, int current) {
        if(isVisited[current]) {
            return;
        }
        isVisited[current] = true;
        if(isVisitedAll(isVisited)) {
            COUNT++;
            isVisited[current] = false;
            return;
        }
        ArrayList<Integer> nextRoutes = routes.get(current);
        for(int next: nextRoutes) {
            countRoutes(routes, isVisited, next);
        }
        isVisited[current] = false;
        return;
    }

    static boolean isVisitedAll(boolean[] isVisited) {
        for(int i = 0; i < isVisited.length; i++) {
            if(!isVisited[i]) return false;
        }
        return true;
    }
}
