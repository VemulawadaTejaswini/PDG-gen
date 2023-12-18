import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Town> towns = new ArrayList<>();
        for (int i = 0; i < n; i++){
            towns.add(new Town(in.nextInt(), in.nextInt()));
        }
        ArrayList<Double> distances = new ArrayList<>();
        for (int i = 0; i < n; i++){
            ArrayList<Town> clone = new ArrayList<>(towns);
            helper(0,clone.remove(i),clone, distances);
        }
        double total = 0;
        for (double d : distances) total += d;
        System.out.println(total/distances.size());
    }

    private static class Town{
        int x;
        int y;
        Town(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static double distance(Town t1, Town t2){
        return Math.sqrt(Math.pow(t1.x-t2.x,2)+Math.pow(t1.y-t2.y,2));
    }

    private static void helper (double travelled, Town current, ArrayList<Town> remaining, ArrayList<Double> distances){
        if (remaining.isEmpty()) {
            distances.add(travelled);
        } else {
            for (int i = 0; i < remaining.size(); i++){
                ArrayList<Town> clone = new ArrayList<>(remaining);
                Town next = clone.remove(i);
                helper(travelled + distance(current, next), next, clone, distances);
            }
        }
    }
}