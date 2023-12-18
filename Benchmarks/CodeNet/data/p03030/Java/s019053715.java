import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class Rstrt {
        String s;
        int p;
        int id;
        public Rstrt(int index, String city, int rank) {
            s = city;
            p = rank;
            id = index;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Rstrt> Rstrts = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Rstrts.add(new Rstrt(i, in.next(), in.nextInt()));
            Rstrts.sort(new Comparator<Rstrt>() {
                @Override
                public int compare(Rstrt o1, Rstrt o2) {
                    int strComp = o1.s.compareTo(o2.s);
                    if (strComp != 0)
                        return strComp;
                    return o1.p < o2.p ? 1 : -1;
                }
            });
        }
        for (int i = 0; i < n; i++){
            System.out.println(Rstrts.get(i).id + 1);
        }
    }
}
