import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int numN = scan.nextInt();
                int[] HP = new int[numN];
                int[][] TMP = new int[numN][numN];
                int[] MIN = new int[numN];
                int min=0;
                int tmp=0;

                for (int i=0; i<numN; i++) {
                    HP[i] = scan.nextInt();
                }

                for (int i=0; i<numN; i++ ){
                    for (int j=0; j<numN; j++) {
                        if ( i == 0 && j == 0 ) {
                            
                        }
                        if ( i == j ) {
                            TMP[i][j] = HP[i];
                        }
                        else {
                            TMP[i][j] = func1(HP[i], HP[j]);
                        }
                    }
                    for (int k=0; k<numN; k++) {
                        if ( k == 0 ) {
                            min = TMP[i][k];
                        }
                        else {
                            if ( min > TMP[i][k] && TMP[i][k] > 0 ) {
                                tmp = min;
                                min = TMP[i][k];
                            }
                        }
                    }
                    MIN[i] = min;
                }

                for (int l=0; l<numN; l++) {
                    if ( l == 0 ) {
                        min = MIN[l];
                    }
                    else {
                        if ( min > MIN[l] ) {
                            tmp = min;
                            min = MIN[l];
                        }
                    }
                }

                System.out.println( min );

                scan.close();
        }
        
        public static int func1(int a, int b) {
            int c = b;
            while ( c <= 0 ) {
                c = c -a;
            }
            return c;
        }
}
