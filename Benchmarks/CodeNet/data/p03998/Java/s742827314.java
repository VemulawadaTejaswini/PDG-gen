import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SA = sc.nextLine();
        String SB = sc.nextLine();
        String SC = sc.nextLine();

        char[] A = SA.toCharArray();
        char[] B = SB.toCharArray();
        char[] C = SC.toCharArray();

        Person person = new Person(A, B, C);
        person.judgetment(A[0]);
    }

    static class Person {
        private final char[] cardA;
        private final char[] cardB;
        private final char[] cardC;

        private final int cardNumberA;
        private final int cardNumberB;
        private final int cardNumberC;

        private int countA = 0;
        private int countB = 0;
        private int countC = 0;

        public Person(char[] A, char[] B, char[] C) {
            this.cardA = A;
            this.cardB = B;
            this.cardC = C;

            this.cardNumberA = A.length;
            this.cardNumberB = B.length;
            this.cardNumberC = C.length;
        }

        private void judgetment(char card) {
            switch (card) {
                case 'a':
                    if (countA == cardNumberA) {
                        System.out.println("A");
                    } else {
                        judgetment(cardA[countA]);
                        countA++;
                    }
                    break;
                case 'b':
                    if (countB == cardNumberB) {
                        System.out.println("B");
                    } else {
                        judgetment(cardB[countB]);
                        countB++;
                    }
                    break;
                case 'c':
                    if (countC == cardNumberC) {
                        System.out.println("C");
                    } else {
                        judgetment(cardC[countC]);
                        countC++;
                    }
                    break;
            }


        }
    }
}