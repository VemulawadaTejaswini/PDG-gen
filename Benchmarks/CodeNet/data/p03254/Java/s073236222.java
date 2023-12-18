import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int x = Integer.parseInt(sc.next());
      	int cnt = 0;
      	for (int i = 1; i <= n; i++) {
          	int a = Integer.parseInt(sc.next());
          	if (n == i) {
              if (a == x) {
              	cnt++;
              }
            } else {
              if (x >= a) {
                  x -= a;
                  cnt++;
              }
            }
        }
      	System.out.println(cnt);
    }
}
