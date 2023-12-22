import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimension = scan.nextInt();
        int[] x = new int[dimension];
        int[] y = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            x[i] = scan.nextInt();
        }
        for (int j = 0; j < dimension; j++) {
            y[j] = scan.nextInt();
        }

        System.out.println(manhattan_distance(dimension, x, y));
        System.out.println(euclid_distance(dimension, x, y));
        System.out.println(minkowski_three(dimension, x, y));
        System.out.println(chebyshev_distance(dimension, x, y));
    }

    public static double manhattan_distance(int dim, int[] x_vector, int[] y_vector) {
        double d_xy = 0.0;
        for (int i = 0; i < dim; i++) {
            d_xy += Math.abs(x_vector[i] - y_vector[i]);
        }
        return d_xy;
    }

    public static double euclid_distance(int dim, int[] x_vector, int[] y_vector) {
        double d_xy = 0.0;
        for (int i = 0; i < dim; i++) {
            d_xy += Math.pow(Math.abs(x_vector[i] - y_vector[i]), 2);
        }
        return Math.sqrt(d_xy);
    }

    public static double minkowski_three(int dim, int[] x_vector, int[] y_vector) {
        double d_xy = 0.0;
        for (int i = 0; i < dim; i++) {
            d_xy += Math.pow(Math.abs(x_vector[i] - y_vector[i]), 3);
        }
        return Math.cbrt(d_xy);
    }

    public static double chebyshev_distance(int dim, int[] x_vector, int[] y_vector) {
        double d_xy = 0.0;
        for (int i = 0; i < dim; i++) {
            if (Math.abs(x_vector[i] - y_vector[i]) > d_xy)
                d_xy = Math.abs(x_vector[i] - y_vector[i]);
        }
        return d_xy;
    }
}