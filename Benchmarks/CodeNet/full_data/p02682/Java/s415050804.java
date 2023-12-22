import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int sum = 0;
      
      if (a<=k) {
        for (int i=0; i<=a; i++) {
          if (b<=k-i) {
            for (int j=0; j<=b; j++) {
              int l=0;
              if (0<k-i-j) {
                l = k-i-j;
              }
              if (sum < i - l) {
                sum = i-l;
              }
            }
          } else {
            for (int j=0; j<=k-i; j++) {
              int l = 0;
              if (0<k-i-j) {
                l = k-i-j;
              }
              if (sum < i - l) {
                sum = i-l;
              }
            }
          }
        }
      } else {
        for (int i=0; i<=k; i++) {
          if (b<=k-i) {
            for (int j=0; j<=b; j++) {
              int l =0;
              if (0<k-i-j) {
                l = k-i-j;
              }
              if (sum <i-l) {
                sum = i-l;
              }
            }
          } else {
            for (int j=0; j<=k-i;j++) {
              int l =0;
              if (0<k-i-j) {
                l = k-i-j;
              }
              if (sum < i - l) {
                sum = i-l;
              }
            }
          }
        }
      }

      System.out.println(sum);
	}

}
