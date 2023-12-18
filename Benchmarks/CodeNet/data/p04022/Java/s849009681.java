import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    ArrayList<Double> arr = new ArrayList<>(n);
    for(int i = 0; i < n; i++) {
      arr.add(scan.nextDouble());
    }
    Collections.sort(arr);
    int result = 0;
    ArrayList<Double> addArr = new ArrayList<>(n);
    LABEL:for(double _l : arr) {
      for(double _addL : addArr) {
        double dum = Math.cbrt(_l*_addL);
        if(dum-(int)dum==0) continue LABEL;
      }
      result++;
      addArr.add(_l);
    }

    System.out.println(result);
  }
}
