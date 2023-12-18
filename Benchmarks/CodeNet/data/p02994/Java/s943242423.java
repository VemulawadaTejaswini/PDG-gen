import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int L = sc.nextInt();
sc.close();
 
int ans = 0;
if (L >= 0) {
System.out.println("A");
  for (int i = 2; i <= N; i++) {
    ans += (i + L - 1);
System.out.println(ans);
  }
} else if (-L > N) {
System.out.println("B");
  for (int i = 1; i <= N - 1; i++) {
    ans += (i + L - 1);
System.out.println(ans);
  }
} else {
System.out.println("C");
 for (int i = 1; i <= N; i++) {
    ans += (i + L - 1);
System.out.println(ans);
  }
}

System.out.println(ans);
}
}