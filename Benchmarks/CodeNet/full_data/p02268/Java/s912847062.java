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
    int s;
    int l;
    int m;
    for (int search : searches) {
      s = 0;
      l = elements.length;
      while (true) {
        m = (s + l) / 2;

        if (elements[m]==search) {
          count++;
          break;
        }

        if (search >= elements[m]) {
          s = m + 1;
        } else {
          l = m;
        }

        if (s >= l) {
          break;
        }
      }
    }
    System.out.println(count);
  }
}

