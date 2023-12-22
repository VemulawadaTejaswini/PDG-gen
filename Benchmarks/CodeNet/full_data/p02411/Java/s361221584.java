import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> m = new ArrayList<Integer>();
        ArrayList<Integer> f = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        int tempm, tempf, tempr;

        while (true) {
            tempm = sc.nextInt();
            tempf = sc.nextInt();
            tempr = sc.nextInt();

            if (tempm == -1 && tempf == -1 && tempr == -1)
                break;

            m.add(tempm);
            f.add(tempf);
            r.add(tempr);
        }

        for (int i = 0; i < m.size(); i++) {
            if(m.get(i) == -1 || f.get(i) == -1) System.out.println("F");
            else if(m.get(i) + f.get(i) >= 80) System.out.println("A");
            else if(m.get(i) + f.get(i) >= 65) System.out.println("B");
            else if(m.get(i) + f.get(i) >= 50) System.out.println("C");
            else if(m.get(i) + f.get(i) >= 30) {
                if(r.get(i) >= 50) System.out.println("C");
                else System.out.println("D");
            }
            else System.out.println("F");
        }

        sc.close();
    }
}
