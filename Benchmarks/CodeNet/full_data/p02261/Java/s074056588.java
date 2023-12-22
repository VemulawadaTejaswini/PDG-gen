import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, i;
        n = cin.nextInt();
        Card[] A = new Card[n];
        Card[] B = new Card[n];
        for (i = 0; i < n; i++) {
            String card = cin.next();
            A[i] = new Card();
            B[i] = new Card();
            B[i].suit = A[i].suit = card.charAt(0);
            B[i].value = A[i].value = card.charAt(1) - '0';
            B[i].inputTime = A[i].inputTime = i;
        }
        
        bubbleSort(A, n);
        sectionSort(B, n);
        
        printCard(A, n);
        checkStable(A, n);
        printCard(B, n);
        checkStable(B, n);
    }
    static void bubbleSort(Card[] A, int n) {
        int i = 0, j = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (j = n - 1; j > i; j--) {
                if (A[j].value < A[j - 1].value) {
                    Card temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    flag = true;
                }
            }
            i++;
        }
    }
    static void sectionSort(Card[] A, int n) {
        int i, j, min;
        for (i = 0; i < n; i++) {
            min = i;
            for (j = i; j < n; j++) {
                if (A[j].value < A[min].value) {
                    min = j;
                }
            }
            if (min != i) {
                Card temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
    }
    static void printCard(Card[] A, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(A[i].suit + "" + A[i].value);
        }
        System.out.println();
    }
    static void checkStable(Card[] A, int n) {
        int i;
        boolean flag = true;
        for (i = 0; i < n - 1; i++) {
            if (A[i].value == A[i + 1].value && A[i].inputTime > A[i + 1].inputTime) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }
    
}

class Card {
    char suit;
    int value;
    int inputTime;
}
