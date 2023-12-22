import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> coefficient = new ArrayList<Integer>();
        List<String> answers = new ArrayList<String>();
        while (scanner.hasNext()) {
            for (int i = 0; i < 6; i++) {
                coefficient.add(Integer.parseInt(scanner.next()));
            }
            SimultaneousEquation equation = new SimultaneousEquation(coefficient);
            equation.compute();
            answers.add(String.format("%.3f", equation.getX()) + " " + String.format("%.3f", equation.getY()));

            coefficient.clear();
        }

        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    private static class SimultaneousEquation {
        private double a, b, c, d, e, f, x, y;

        SimultaneousEquation(List<Integer> coefficient) {
            this.a = coefficient.get(0);
            this.b = coefficient.get(1);
            this.c = coefficient.get(2);
            this.d = coefficient.get(3);
            this.e = coefficient.get(4);
            this.f = coefficient.get(5);
        }

        void compute() {
            double denominator = a * e - d * b;
            if (denominator != 0) {
                this.x = (c * e - f * b) / denominator;
                this.y = (a * f - d * c) / denominator;

                if (this.x == 0) {
                    this.x = Math.abs(this.x);
                }
                
                if (this.y == 0) {
                    this.y = Math.abs(this.y);
                }
            }
        }

        double getX() {
            return this.x;
        }

        double getY() {
            return this.y;
        }
    }
}