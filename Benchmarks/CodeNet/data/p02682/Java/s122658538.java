import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int sum = -2000000000;
      int l=0;
      
      if (a<=k) {
        for (int i=0; i<=a; i++) {
          if (b<=k-i) {
            for (int j=0; j<=b; j++) {
              if (sum<i-j) {
                sum = i-j;
              }
            }
          } else {
            for (int j=0; j<=k-i; j++) {
              if (sum<i-j) {
                sum = i-j;
              }
            }
          }
        }
      } else {
        for (int i=0; i<=k; i++) {
          if (b<=k-i) {
            for (int j=0; j<=b; j++) {
              if (sum<i-j) {
                sum = i-j;
              }
            }
          } else {
            for (int j=0; j<=k-i;j++) {
              if (sum<i-j) {
                sum = i-j;
              }
            }
          }
        }
      }

      System.out.println(sum);
	}

}
