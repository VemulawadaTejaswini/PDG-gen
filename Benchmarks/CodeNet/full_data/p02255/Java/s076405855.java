import java.util.Scanner;

class _insertionSort {

        // Default Constructor
        public void _insetrionSort() {
        }

        // sort method :: sort given array using insertion Sort
        public static void sort(int[] _A, int _n) {
                for (int i = 1; i < _n; ++i) {

                        // print(_A);
                        int tmp = _A[i];
                        int j = i - 1;
                        while (j >= 0 && _A[j] > tmp) {
                                _A[j + 1] = _A[j];
                                --j;
                        }
                        _A[j + 1] = tmp;
                        print(_A);
                        // System.out.println("i = " + i);
                }

        }

        // print method :: print array
        public static void print(int[] _A) {
                for (int i = 0; i < _A.length; ++i) {
                        System.out.print(_A[i]);
                        if (i != _A.length - 1)
                                System.out.print(" ");
                }
                System.out.println();
        }

}
public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ////////////////////////////////////
                int n = 0;
                int[] A;

                n = sc.nextInt();
                sc.nextLine();
                A = new int[n];
                for (int i = 0; i < n; ++i)
                        A[i] = sc.nextInt();

                _insertionSort.print(A);
                _insertionSort.sort(A, n);

                ////////////////////////////////////
                sc.close();
        }

}