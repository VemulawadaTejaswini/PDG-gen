import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int robots = scanner.nextInt();
        int lastX = -1;
        int countOfLastRobots = 0;
        Map<Integer, Integer> robotss = new TreeMap<>();
        for (int i = 0; i < robots; i++) {
            String line = scanner.nextLine();
            while (line.equals("")) {
                line = scanner.nextLine();
            }
            String[] robotInfo = line.split(" ");
            int x = Integer.parseInt(robotInfo[0]);
            int l = Integer.parseInt(robotInfo[1]);
            robotss.put(x,l);
        }
        Object[] key = robotss.keySet().toArray();
        Arrays.sort(key);
        for (Integer integer : robotss.keySet()) {
            int x = integer;
            int l = robotss.get(x);
            if (lastX == -1) {
                countOfLastRobots++;
                lastX = x;
            } else if (lastX + l <= x) {
                countOfLastRobots++;
                lastX = x;
            }
        }
        System.out.println(countOfLastRobots);
    }
}