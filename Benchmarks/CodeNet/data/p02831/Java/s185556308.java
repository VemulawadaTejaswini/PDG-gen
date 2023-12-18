import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int low;
    int high;
    
    if (a<b) {
      low = a;
      high = b;
    }
    else {
      low = b;
      high = a;
    }
    
    for (int i=1; i<low; i++) {
      if (low%i==0) {
        if (high%i==0) {
          low /= i;
        }
      }
    }
    
    System.out.println(high * low);
  }
}
