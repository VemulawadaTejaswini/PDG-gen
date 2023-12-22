import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ctare on 2017/05/08.
 */
public class Main {
    private static final int Tn = 50 + 1;
    private static final int Mn = 300 + 1;
    private static final int Pn = 10 + 1;
    private static ArrayList<String> buf;
    private static int[][] simple_rank(int[][] team, Set<Integer> exteam){
        int[][] winner = new int[Pn][Tn];
        for (int i = 0; i < team.length; i++) {
            int[] ints = team[i];
            if(exteam.contains(i)) winner[Arrays.stream(ints).sum()][i] = 1;
        }
        return winner;
    }

    private static void rank(int[] team, int[][][] team_sub){
        TreeMap<Integer, ArrayList<Integer>> rankresult = new TreeMap<>();
        for (int i = 0; i < team.length; i++) {
            if(team[i] == 1){
                int sum_time = 0;
                for (int[] ms : team_sub[i]) {
                    sum_time += calc_point(ms);
                }
                ArrayList<Integer> rr = rankresult.getOrDefault(sum_time, new ArrayList<>());
                rr.add(i);
                rankresult.put(sum_time, rr);
//                System.out.print("--- ");
//                System.out.print(sum_time);
//                System.out.println(" : " + i);
            }
        }
//        System.out.println(rankresult.values());
//        rankresult.values().forEach(e -> {
//            System.out.println(String.join("=", e.stream().sorted(Comparator.reverseOrder()).map(Object::toString).collect(Collectors.toList())));
//        });
        rankresult.values().forEach(e -> {
            buf.add(String.join("=", e.stream().sorted(Comparator.reverseOrder()).map(Object::toString).collect(Collectors.toList())));
        });
    }

    private static int calc_point(int[] times){
//        System.out.println("calcpoint");
//        System.out.println(Arrays.toString(times));
        int result = 0;
        forelse: {
            for (int i = 0; i < times.length; i++) {
                if(times[i] == -1) result += 20;
                else if(times[i] == 1) {
                    result += i;
                    break forelse;
                }
            }
            result = 0;
        }
//        System.out.println(result);
//        System.out.println("calcpoint end");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            buf = new ArrayList<>();
            int M = sc.nextInt(), T = sc.nextInt(), P = sc.nextInt(), R = sc.nextInt();
            if(M == 0 && T == 0 && P == 0 && R == 0) break;
            int[][] team = new int[Tn][Pn];
            int[][][] team_sub = new int[Tn][Pn][Mn];
            Set<Integer> exteam = new HashSet<>();
            for (int i = 1; i <= T; i++) {
                exteam.add(i);
            }
            for (int i = 0; i < R; i++) {
                int m = sc.nextInt(), t = sc.nextInt(), p = sc.nextInt(), j = sc.nextInt();
                team[t][p] |= (j == 0 ? 1 : 0);
                team_sub[t][p][m] = (j == 0 ? 1 : 0)*2 - 1;
            }

            int[][] winner = simple_rank(team, exteam);
            for (int i = winner.length - 1; i >= 0; i--) {
                int sum = Arrays.stream(winner[i]).sum();
                if(sum > 1){
                    rank(winner[i], team_sub);
                } else if(sum > 0) {
                    buf.add(String.valueOf(Arrays.stream(winner[i]).boxed().collect(Collectors.toList()).indexOf(1)));
//                    System.out.println(String.valueOf(Arrays.stream(winner[i]).boxed().collect(Collectors.toList()).indexOf(1)));
                }
            }

            System.out.println(String.join(",", buf));
        }
    }
}