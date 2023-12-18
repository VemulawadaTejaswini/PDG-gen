import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = Integer.parseInt(sc.next());
        int dimensions = Integer.parseInt(sc.next());
        
        int[][] coordinate = new int[points][dimensions];
        
        for (int i = 0; i < points; i++) {
            for (int j = 0; j < dimensions; j++) {
                coordinate[i][j] = Integer.parseInt(sc.next());
            }
        }

        int intCount = 0;
        for (int i = 0; i < (points - 1); i++) {
            for (int j = i + 1; j < points; j++) {
                int pointDistance = 0;

                for (int dimension = 0; dimension < dimensions; dimension++) {
                    pointDistance += Math.abs(Math.pow(coordinate[i][dimension] - coordinate[j][dimension], 2));
                }

                double distance = Math.sqrt(pointDistance);
                if ((distance % 1) == 0) {
                    intCount++;
                }
            }
        }

        System.out.println(intCount);
    }
}