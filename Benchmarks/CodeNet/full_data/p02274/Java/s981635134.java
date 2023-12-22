
import java.util.Scanner;
//import java.util.Arrays ;

// import java.InputMismatchException;
// alds_5b, Aizu Online Judge accept only class name: Main


class Main {

    public static int merge_count = 0 ;

    static long bubble(int [] A, int elem_count) {
        long swap_count = 0 ;
        for (int i=0; i<elem_count-1; i++) {
            for (int x=i+1; x<elem_count; x++) {
                if (A[x] < A[i]) swap_count++ ;
            }
        }
        return swap_count ;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine() ;

        int elem_count = Integer.parseInt(s) ;
        int A[] = new int[elem_count] ;

        for (int i=0; i<elem_count; i++) {
            A[i] = scanner.nextInt() ;
        }

        scanner.close() ;
        System.out.println(bubble(A,elem_count)) ;
    }
}

