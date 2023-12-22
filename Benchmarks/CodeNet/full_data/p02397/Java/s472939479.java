import java.util.ArrayList;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
        List<integer> array = new ArrayList<integer>();
        Scanner inp = new Scanner(System.in);
        int x = -1, y = -1;
        int batas = 0;
        while (((x != 0) && (y != 0)) && batas <= 3000) {
            x = inp.nextInt();
            y = inp.nextInt();
            if (((x != 0) && (x <= 10000)) && ((y != 0) && (y <= 10000))) {
                array.add(x);
                array.add(y);
                batas++;
            }
        }
        int index1 = 0, index2 = index1 + 1;
        for (int i = 0; i < batas; i++) {
            System.out.println(array.get(index1) + " " + array.get(index2));
            index1++;
        }
    }
}
