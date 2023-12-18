import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int[] points;
    private static NeighborList[] neighbors;

    private static class NeighborList {
        ArrayList<Integer> nl;
        public NeighborList() {
            nl = new ArrayList<Integer>();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] mainParams = scanner.nextLine().split(" ");
        int paramN = Integer.parseInt(mainParams[0]);
        int paramQ = Integer.parseInt(mainParams[1]);
        points = new int[paramN];
        neighbors = new NeighborList[paramN + 1];

        for (int i = 0; i < paramN + 1; i++) {
            neighbors[i] = new NeighborList();
        }

        for (int i = 0; i < paramN - 1; i++) {
            String[] data = scanner.nextLine().split(" ");
            neighbors[Integer.parseInt(data[0])].nl.add(Integer.parseInt(data[1]));
            neighbors[Integer.parseInt(data[1])].nl.add(Integer.parseInt(data[0]));
        }

        for (int i = 0; i < paramQ; i++) {
            String[] data = scanner.nextLine().split(" ");
            points[Integer.parseInt(data[0]) - 1] += Integer.parseInt(data[1]);
        }

        scanner.close();

        addCountToPoint(1, 0);

        String[] outs = new String[points.length];
        for (int i = 0; i < points.length; i++) {
            outs[i] = String.valueOf(points[i]);
        }

        System.out.println(String.join(" ", outs));
    }

    private static void addCountToPoint(int pointId, int p) {
        ArrayList<Integer> nei = neighbors[pointId].nl;
        for (int i = 0; i < nei.size(); i++) {
            int neId = nei.get(i);
            if (neId == p) continue;
            points[neId - 1] += points[pointId - 1];
            addCountToPoint(neId, pointId);
        }
    }
}