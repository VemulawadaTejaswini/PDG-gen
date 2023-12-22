import java.util.Scanner;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = int(sc.nextLine());
  String[] s = sc.nectLine().split(" ");
  int product = 0; 
  for(int i = 0; i<n; i++) {
    for(int j = i; j<=n; j++) {
    	product += (int(s[i])* int(s[j]));
    }
  }
  return product % (10**9 + 7)
}