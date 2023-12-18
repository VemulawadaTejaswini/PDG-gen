import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [][] array = new String[n][3];
        for(int i=0;i<n;i++) {
           array[i][0] = ""+(i+1);
           array[i][1] = sc.next();
           array[i][2] = sc.next();
        }
        TheComparator comparator = new TheComparator();
        comparator.setIndex(2);
        Arrays.sort(array,comparator);
        //
        TheComparator comparator2 = new TheComparator();
        comparator2.setIndex(1);
        Arrays.sort(array,comparator2);
        for(int i=0;i<n;i++){
            System.out.println(array[i][0]);
        }
        }
}
class TheComparator implements Comparator {
    private int index = 0;
    public void setIndex( int index ) {
        this.index = index;
    }
    public int compare( Object a, Object b ) {
        String[] strA = ( String[] ) a;
        String[] strB = ( String[] ) b;
        return ( strA[ index ].compareTo( strB[ index ] ) );
    }
}