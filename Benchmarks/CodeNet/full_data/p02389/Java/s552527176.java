class Rectangle{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int x = a * b;
    int y = 2 * a + 2 * b;
    System.out.println(x + " " + y);
  }
}