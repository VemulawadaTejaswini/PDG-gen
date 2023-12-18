import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long aList[] = new long[n];
    
    long multiNum = 1;
    for (int i=0; i<n; i++) {      
      int cur = sc.nextInt();
      aList[i] = cur;
      multiNum = lcm(multiNum, cur);
    }
    
    long count = 0;
    for (long a : aList) {
      count += multiNum/a;
    }
    
    System.out.println((int)(count%(Math.pow(10, 9)+7)));
    System.out.println(multiNum);
  }
  
  static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
}