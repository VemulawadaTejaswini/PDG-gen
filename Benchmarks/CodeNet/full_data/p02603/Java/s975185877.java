import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n];
    int a = 0;
    b[0] = 10000;
    boolean trig = true;
    int j = 0;
    long money = 1000;
    int kabu = 0;
    
    for (int i=0; i<n; i++){
      a = sc.nextInt();
      if (trig && b[j]>=a) {
        b[j] = a;
      } else if (trig) {
        trig = false;
        j++;
        b[j] = a;
      } else if (!trig && b[j]<=a) {
        b[j] = a;
      } else {
        trig = true;
        j++;
        b[j] = a;
      }
    }
        
    for (int i=0; i<=j; i++){
      if (i%2 == 1){
        money = money + kabu * b[i];
        kabu = 0;
      } else {
        kabu = money / b[i];
        money = money % b[i];
      }
    }
    
	System.out.println((money + kabu*b[j]));
    sc.close();
  }
}