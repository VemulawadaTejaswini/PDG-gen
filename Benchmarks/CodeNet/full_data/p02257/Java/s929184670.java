import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int count = 0;

    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    for (int num : array) {
      if(checkPrime(num)) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static boolean checkPrime(int num) {
    int mod;
    for (int i = 2; i < num; i++) {
      mod = num % i;
      if (mod == 0) {
        return false;
      }
    }
    return true;
  }
}

