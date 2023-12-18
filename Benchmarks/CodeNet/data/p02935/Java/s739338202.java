import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    Integer[] array = new Integer[n];
    double sum = 0;

    for(int i=0; i<n; i++){
      a = sc.nextInt();
      array[i] = a;
    }
    Arrays.sort(array,Comparator.reverseOrder());
    //for(int k=0; k<n; k++){
      //System.out.println(array[k]);
    //}
    for(int k=0; k<n-1; k++ ){
      double sub_sum = array[k]/Math.pow(2,k+1) ;
      sum += sub_sum;
      //System.out.println("sum:"+sum);
    }
    sum += array[n-1]/Math.pow(2,n-1);
    System.out.println(sum);
  }
}