import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();

        boolean[][] matrix = new boolean[dimension][dimension];

        boolean allWhite = true;
        boolean allBlack = true;

        int[][] filledCells = new int[dimension][2];

        for (int i = 0; i < dimension; i++) {
            String line = scanner.next();
            filledCells[i][0] = i;
            for (int j = 0; j < dimension; j++) {

                char current = line.charAt(j);
                if (current == '#') {
                    matrix[i][j] = true;
                    filledCells[i][1]++;
                    allWhite = false;
                } else {
                    allBlack = false;
                }
            }
        }

        if (allBlack) {
            System.out.println(0);
            return;
        }
        if (allWhite) {
            System.out.println(-1);
            return;
        }

        boolean hasFillRow = false;

        for (int i = 0; i < dimension; i++) {
            int j = 0;
            boolean isRowFill = matrix[i][j];

            while (isRowFill) {
                if (j == dimension - 1) break;
                isRowFill &= matrix[i][++j];
            }
            if (isRowFill) {
                hasFillRow = true;
                break;
            }
        }

        int countOfFillColumn = 0;

        for (int i = 0; i < dimension; i++) {
            int j = 0;
            boolean isColumnFill = matrix[j][i];

            while (isColumnFill) {
                if (j == dimension - 1) break;
                isColumnFill &= matrix[j++][i];
            }
            if (isColumnFill) {
                countOfFillColumn++;
            }
        }

        if (hasFillRow) {
            System.out.println(dimension - countOfFillColumn);
            return;
        }

        Arrays.sort(filledCells, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        });

        int minPrice = Integer.MAX_VALUE;

        boolean hasGoodVariant = false;

        for (int i = 0; i < dimension; i++) { // Строка с найбольшим кол-вом закрашенных

            boolean isRowValid = true;

            for (int j = 0; j < dimension; j++) { // Элемент в строке с найбильшим кол-вом закаршенных
                if (!matrix[filledCells[i][0]][j]) {

                    boolean isEmptyCellFillable = false;

                    for (int k = 0; k < dimension; k++) {
                        if (matrix[k][filledCells[i][0]]) {
                            isEmptyCellFillable = true;
                            break;
                        }
                    }

                    if (!isEmptyCellFillable) {
                        isRowValid = false;
                        break;
                    }
                }
            }

            if (isRowValid) {
                hasGoodVariant = true;
                minPrice = Math.min((2 * dimension - filledCells[i][1]) - countOfFillColumn, minPrice);
                break;
            }
        }

        if (hasGoodVariant) {
            System.out.println(minPrice);
        } else {
            System.out.println(2 * dimension);
        }

    }

}