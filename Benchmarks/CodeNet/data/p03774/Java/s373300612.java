
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    long X;
    long Y;

    Main(long X, long Y) {
        this.X = X;
        this.Y = Y;
    }

    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        long N = Input.nextLong();
        long M = Input.nextLong();
        ArrayList<Main> Student = new ArrayList();
        ArrayList<Main> Checkpoint = new ArrayList();
        ArrayList<Long> Values = new ArrayList();
        for (int I = 0; I < N; I++) {
            Student.add(new Main(Input.nextLong(), Input.nextLong()));
        }
        for (int I = 0; I < M; I++) {
            Checkpoint.add(new Main(Input.nextLong(), Input.nextLong()));
        }
        long LastIndex = 1;
        for (int I = 0; I < Student.size(); I++) {
            long Min = 1999999999;
            for (int J = 0; J < Checkpoint.size(); J++) {
                long X = Math.abs(Student.get(I).X - Checkpoint.get(J).X) + Math.abs(Student.get(I).Y - Checkpoint.get(J).Y);
                //System.out.println(X + "X");
                if (X < Min) {
                    Min = X;
                    //System.out.println(X + "XXX");
                    LastIndex = J + 1;
                    //System.out.println(LastIndex + "JJJ");
                }
            }
            System.out.println(LastIndex);
        }

    }
}// You Wont Learn If You Always Copy