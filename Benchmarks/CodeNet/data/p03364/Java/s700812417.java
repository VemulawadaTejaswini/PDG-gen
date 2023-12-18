import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
             int N = sc.nextInt();
             Face face1 = new Face(N);
             for ( int i = 0; i < N; i++ ) {
                 String row = sc.next();
                 face1.addRow(row);
             }
             face1.print();
             int answer = 0;
             for ( int A = 0; A < N; A++ ) {
                 for ( int B = 0; B < N; B++ ) {
                     Face face2 = new Face(N);
                     for ( int i = 1; i <= N ; i++ ) {
                         for ( int j = 1; j <= N; j++ ) {
                             int ii = i - A;
                             if ( ii < 1 ) { ii = ii + N; };
                             int jj = j - B;
                             if ( jj < 1 ) { jj = jj + N; };
                             face2.set(i, j, face1.get(ii, jj));
                         }
                     }
                     face2.print();
                     if ( face2.isGood() ) {
                         answer++;
                     }
                 }
             }
             System.out.println(answer);
        };
    }

    private static class Face {
         private final int N;
         private final List<String> rowList;

         public Face(int N) {
              this.N = N;
              rowList = new LinkedList<String>();
         }

         public void print() {
//             System.out.println();
//             for ( String row : rowList ) {
//                 System.out.println(row);
//             }
         }

         public void addRow(String row) {
             rowList.add(row);
         }

         public String get(int i, int j) {
             String row = rowList.get(i-1);
             return row.substring(j-1,j);
         }

         public void set(int i, int j, String v) {
             int nRows = rowList.size();
             if ( nRows < i ) {
                 StringBuilder sb = new StringBuilder();
                 for ( int jj = 0; jj < N; jj++ ) {
                     sb.append(" ");
                 }
                 String rowDefault = sb.toString();
                 for ( int ii = nRows; ii < i; ii++ ) {
                     rowList.add(rowDefault);
                 }
             }
             String row = rowList.get(i-1);
             StringBuilder sb = new StringBuilder();
             for ( int jj =0; jj < N; jj++ ) {
                 if ( jj == j - 1 ) {
                     sb.append(v);
                 }
                 else {
                     sb.append(row.substring(jj, jj+1));
                 }
             }
             rowList.set(i-1, sb.toString());
         }

         public boolean isGood() {
             for ( int i = 1; i <= N; i++ ) {
                 for ( int j = i + 1; j <= N; j++ ) {
                     String v1 = get(i, j);
                     String v2 = get(j, i);
                     if ( v1.equals(v2) == false ) return false;
                 }
             }
             return true;
         }
    }
}