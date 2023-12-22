import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(editDistance(s1, s2));
    }

    private static int editDistance(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[][] distance = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) {
            distance[i][0] = i;
        }
        for (int j = 1; j <= l2; j++) {
            distance[0][j] = j;
        }

        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                int substitutionCost;
                int deletionCost = distance[i-1][j] + 1;
                int insertionCost = distance[i][j-1] + 1;
                if (chars1[i-1] == chars2[j-1]) {
                    substitutionCost = distance[i-1][j-1];
                } else {
                    substitutionCost = distance[i-1][j-1] + 1;
                }
                distance[i][j] = Math.min(Math.min(deletionCost, insertionCost), substitutionCost);
            }
        }
        return distance[l1][l2];
    }
}

