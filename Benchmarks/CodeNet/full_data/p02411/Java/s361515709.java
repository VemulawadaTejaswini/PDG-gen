import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean keepGoing = true;

        while(keepGoing){
            double m = inp.nextInt();
            double f = inp.nextInt();
            double r = inp.nextInt();

            if (m == -1 && f == -1 && r == -1) {
                keepGoing = false;
            } else {
                if (r != -1) {
                    System.out.println(gradeWithMakeup(m, f, r));
                } else {
                    System.out.println(gradeWithoutMakeup(m, f));
                }
            }
        }
    }

    public static String gradeWithMakeup(double m, double f, double r) {
        if (m == -1 || f == -1) {
            return "F";
        }

        /*
        if (m != -1) {
            mf += m;
            mfTotal += mTotal;
        }

        if (f != -1) {
            mf += f;
            mfTotal += fTotal;
        } */

        //System.out.println(mf + " " + mfTotal);
        //System.out.println("---____");

        double grade = ((m + f)/100) *100;

        if (grade >= 80) {
            return "A";
        } else if (grade >= 65) {
            return "B";
        } else if (grade >= 50) {
            return "C";
        } else if (grade >= 30) {
            if (r >= 50) {
                return "C";
            }
            return "D";
        } else {
            return "F";
        }
    }

    public static String gradeWithoutMakeup(double m, double f) {
        if (m == -1 || f == -1) {
            return "F";
        }

        //System.out.println(mf + " " + mfTotal);
        //System.out.println("---");

        double grade;

        grade = ((m + f)/100)*100;

        if (grade >= 80) {
            return "A";
        } else if (grade >= 65) {
            return "B";
        } else if (grade >= 50) {
            return "C";
        } else if (grade >= 30) {
            return "D";
        } else {
            return "F";
        }
    }
}

