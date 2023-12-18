import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextInt();
    long b = sc.nextInt();
    
    long low;
    long high;
    
    if (a<b) {
      low = a;
      high = b;
    }
    else {
      low = b;
      high = a;
    }
    
    List<Long> lowDivisor = new ArrayList<Long>();
    // 1はいける？
    for (long i=2; i<low; i++) {
      if (low%i==0) {
        lowDivisor.add(i);
      }
    }
    
    Collections.sort(lowDivisor, Collections.reverseOrder());
    
    long resultHigh = high;
    for (long div: lowDivisor) {
      if (resultHigh%div==0) {
        resultHigh /= div;
      }
    }
    
    System.out.println(low*resultHigh);
    
  }
}