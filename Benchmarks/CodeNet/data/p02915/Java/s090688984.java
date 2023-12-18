public class password {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  PrintWriter pw = new PrintWriter(System.out);
  int n = sc.nextInt();
  pw.println(n*n*n);
  sc.close();
  pw.close();
}
}