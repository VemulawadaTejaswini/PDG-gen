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
        comparator.setIndex(1);
        Arrays.sort(array,comparator);
        for(int i=0;i<n;i++){
            while(
                    (array[i-1][1]==array[i][1]&&Integer.parseInt(array[i-1][2])>=Integer.parseInt(array[i][2]))
            ){
                    String[][] a=new String[1][3];
                    a[0][0]=array[i][0];
                    a[0][1]=array[i][2];
                    a[0][2]=array[i][3];
                    array[i][0]=array[i-1][0];
                    array[i][1]=array[i-1][1];
                    array[i][2]=array[i-1][2];
                    array[i-1][0]=a[0][0];
                    array[i-1][1]=a[0][1];
                    array[i-1][2]=a[0][2];
            }
        }
        /*
        TheComparator comparator2 = new TheComparator();
        comparator2.setIndex(1);
        Arrays.sort(array,comparator2);
        */
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