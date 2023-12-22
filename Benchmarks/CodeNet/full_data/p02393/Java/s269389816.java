import java.util.Scanner;
class Main {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int c = scanner.nextInt();
  int[] numbers = {a, b, c};
  int temp;
  for (int i = 0; i < numbers.length - 1; i++) {
      for(int j = numbers.length - 1; j > i; j--){
          if(numbers[j -1] > numbers[j]){
              temp = numbers[j -1];
              numbers[j-1] = numbers[j];
              numbers[j] = temp;
          }
      }
  }
  System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
  }
}