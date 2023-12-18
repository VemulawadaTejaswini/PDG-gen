import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int size = Ent.nextInt();
        LinkedList lista = new LinkedList();
        for (int i = 0; i < size; i++) {
            lista.add(Ent.nextInt());
        }
        Collections.sort(lista);
        System.out.println(lista.get(1));
    }
}
