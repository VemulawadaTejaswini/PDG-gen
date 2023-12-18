import java.util.*;
import java.math;
public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+10];
    for(int i =1;i<=n;i++){
      a[i] = sc.nextLong();
    }
    quicksort(a,1,n);
    Point po = new Point(n,n-1);
    double rad = math.abs(2-n/(n-1));
    for(double i = n;i>=1;i--){
      for(double j = n-1;j>=1;j--){
        s = math.abs(2-i/j);
        if(s<rad){
          po = new Point(i,j);
          rad = s;
        }
      }
    }

    System.out.println(po.x + " " + po.y);
    sc.close();
    }


    
    public static void quickSort(long[] array, int left, int right) {
        int curleft = left;
        int curright = right;
        long pivot = array[(curleft + curright) / 2];
        
        do {
            while (array[curleft] < pivot) {
                curleft++;
            }
            
            while (array[curright] > pivot) {
                curright--;
            }
            if (curleft <= curright) {
                swap (array, curleft++, curright--);
            }
        } while (curleft <= curright);
        
        if (left < curright) {
            quickSort(array, left, curright);
        }
        
        if (curleft < right) {
            quickSort(array, curleft, right);
        }
    }
    
    private static void swap (long[] array, int idx1, int idx2) {
        long tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
  }