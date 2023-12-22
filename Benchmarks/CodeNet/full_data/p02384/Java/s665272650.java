import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice();
        dice.inputDice(sc);

        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());

            dice.searchFromTopAndFront(t, f);

            System.out.println(dice.getRight());
        }
    }

    static class Dice {
        private List<Integer> D = new ArrayList<>();

        void inputDice(Scanner sc)  {
            for (int i = 0; i < 6; i++) D.add(Integer.parseInt(sc.next()));
        }

        int getTop() {
            return D.get(0);
        }

        int getRight() {
            return D.get(2);
        }

        int getFromt() {
            return D.get(1);
        }

        void searchFromTopAndFront(int top, int front) {
            while (!(getTop() == top && getFromt() == front)) {
                if (getTop() == top && getFromt() != front) {
                    slideRight();
                } else if (getTop() != top && getFromt() == front) {
                    moveE();
                } else {
                    moveN();
                }
            }
        }

        void move(String t) {
            for (String s : t.split("")) {
                switch (s) {
                    case "N":
                        moveN();
                        break;
                    case "E":
                        moveE();
                        break;
                    case "W":
                        moveW();
                        break;
                    case "S":
                        moveS();
                        break;
                }
            }
        }

        private void slideRight() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(0));
            tmp.add(D.get(3));
            tmp.add(D.get(1));
            tmp.add(D.get(4));
            tmp.add(D.get(2));
            tmp.add(D.get(5));

            D = new ArrayList<>(tmp);
        }

        private void slideLeft() {
            slideRight();
            slideRight();
            slideRight();
        }

        private void moveN() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(1));
            tmp.add(D.get(5));
            tmp.add(D.get(2));
            tmp.add(D.get(3));
            tmp.add(D.get(0));
            tmp.add(D.get(4));

            D = new ArrayList<>(tmp);
        }

        private void moveE() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(3));
            tmp.add(D.get(1));
            tmp.add(D.get(0));
            tmp.add(D.get(5));
            tmp.add(D.get(4));
            tmp.add(D.get(2));

            D = new ArrayList<>(tmp);
        }

        private void moveW() {
            moveE();
            moveE();
            moveE();
        }

        private void moveS() {
            moveN();
            moveN();
            moveN();
        }
    }
}