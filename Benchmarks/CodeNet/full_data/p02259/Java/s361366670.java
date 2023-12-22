import java.util.Scanner;

class BubbleSort {

  public int n = 0;

  public BubbleSort(int[] argv ) {
    sort(argv);
    for(int i = 0; i < (argv.length - 1); i++){
      System.out.printf("%d ", argv[i]);
    }
    System.out.println(argv[argv.length - 1]);
    System.out.printf("%d\n", n);
  }


  public void sort( int[] array ) {
    int tmp=0; //作業領域
    for( int i=0; i<array.length-1; i++ ) {
       for( int j=0; j<array.length-i-1; j++ ) {
          if( array[j] > array[j+1] ) {
              tmp = array[j];
              array[j] = array[j+1];
              array[j+1] = tmp;
              n += 1;
          }
       }
    }
  }
}

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int[] a = new int[x];
    for(int i = 0; i < x; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    BubbleSort bs = new BubbleSort(a);
  }
}
