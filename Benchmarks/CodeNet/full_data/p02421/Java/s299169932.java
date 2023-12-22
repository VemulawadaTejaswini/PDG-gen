import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int Taro = 0;
      int Hanako = 0;
      for (int i =0; i<n; i++) {
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
          Taro += 1;
          Hanako += 1;
        } else if (a.compareTo(b)>0) {
          Taro += 3;
        } else {
          Hanako += 3;
        }
      }
        System.out.println(Taro + " " + Hanako);
    }
}
