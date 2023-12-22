import java.util.Scanner;

 class Main {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int a, b, c;
  a = scan.nextInt();
  b = scan.nextInt();
  c = scan.nextInt();
  int[] array = { a, b, c };
  for (int i = 0; i < array.length; i += 1) {
   for (int j = i + 1; j < array.length; j += 1) {
    if (array[j] < array[i]) {
     int temp = array[i];
     array[i] = array[j];
     array[j] = temp;
    }
   }
  }
  for (int n = 0; n < array.length; n += 1) {
   if (n == array.length - 1) {
    System.out.println(array[n]);
   } else {
    System.out.print(array[n] + " ");
   }
  }
 }
}