import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        int[] a = new int[total];

        for (int k = 0; k < total; k++) {
            String command = inp.next();

            switch (command) {
                case "insert": {
                    int num = inp.nextInt();

                    insert_x(num);
                    break;
                }
                case "delete": {
                    int num = inp.nextInt();

                    delete_x(num);
                    break;
                }
                case "deleteFirst":
                    deleteFirst();
                    break;
                case "deleteLast":
                    deleteLast();
                    break;
            }
        }

        for (int l = 0; l < list.size(); l++) {
            if (l == 0) {
                System.out.printf("%s", list.get(l));
            } else {
                System.out.printf(" %s", list.get(l));
            }
        }
    }

    public static void insert_x(int num) {
        list.add(0, num);
    }

    public static void delete_x(int num) {
        list.remove(list.indexOf(num));
    }

    public static void deleteFirst() {
        list.remove(0);
    }

    public static void deleteLast() {
        list.remove(list.size()-1);
    }
}

