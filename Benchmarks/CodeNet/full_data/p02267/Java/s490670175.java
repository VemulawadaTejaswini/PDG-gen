import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] elements = new int[size];
    for (int i = 0; i < size; i++) {
      elements[i] = sc.nextInt();
    }

    int searchSize = sc.nextInt();
    int[] searches = new int[searchSize];
    for (int i = 0; i < searchSize; i++) {
      searches[i] = sc.nextInt();
    }

    search(elements, searches);
  }

  public static void search(int[] elements, int[] searches) {
    int count = 0;
    for (int search : searches) {
      for (int elem : elements) {
        if (elem == search) {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}

