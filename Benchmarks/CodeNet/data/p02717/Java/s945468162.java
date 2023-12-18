public static void main(String[] args) {
  int a, b, c, tmp;
  scanInt = new java.util.Scanner(System.in);
  a = scanInt.nextInt;
  b = scanInt.nextInt;
  c = scanInt.nextInt;
  
  tmp = a;
  a = b;
  b = tmp;
  
  tmp = a;
  a = c;
  c = tmp;
  
  System.out.println(a + " " + b + " " + c);
  
}
  