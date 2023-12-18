import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0;i < n;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        List<List<Integer>> routes = new ArrayList<>();
        List<Integer> candidate = new ArrayList<>();
        for(int i = 0;i < n;i++) candidate.add(i);

        searchRoute(candidate, new ArrayList<>(), routes);
        
        double totalD = 0;
        for(int i = 0;i < routes.size();i++) {
            List<Integer> route = routes.get(i);
            for(int j = 0;j < route.size() - 1;j++) {
                int x1 = x[route.get(j)];
                int y1 = y[route.get(j)];
                int x2 = x[route.get(j + 1)];
                int y2 = y[route.get(j + 1)];
                totalD += (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
            }
        }

        double ans = totalD / routes.size();
        System.out.println(ans);
    }

    private static void searchRoute(List<Integer> candidate, List<Integer> route, List<List<Integer>> result) {
        if(candidate.isEmpty()) {
            result.add(route);
        }

        for(int i = 0;i < candidate.size();i++) {
            Integer tmp = candidate.get(i);
            List<Integer> tmpCandidate = new ArrayList<>(candidate);
            List<Integer> tmpRoute = new ArrayList<>(route);
            tmpCandidate.remove(i);
            tmpRoute.add(tmp);
            searchRoute(tmpCandidate, tmpRoute, result);
        }

        return;
    }

}
