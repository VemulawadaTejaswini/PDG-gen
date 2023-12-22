import java.util.Scanner;

class Main {

  static int KEY = 0;
  static int PREV = 1;
  static int NEXT = 2;

  static int START = 0;
  static int CURRENT = 0;
  static int BEFORE = 0;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    int times = sc.nextInt();

    int[][] linkedList = new int[2000000][3];
    for (int i = 0; i < 2000000; i++) {
      linkedList[i][0] = -1;
      linkedList[i][1] = -1;
      linkedList[i][2] = -1;
    }

    String input;

    for (int i = 0; i < times; i++) {
      input = sc.next();
      if (input.equals("insert")) {
        insert(linkedList, sc.nextInt());
      } else if (input.equals("delete")) {
        delete(linkedList, sc.nextInt());
      } else if (input.equals("deleteFirst")) {
        deleteFirst(linkedList);
      } else {
        deleteLast(linkedList);
      }
    }

    printList(linkedList);
  }

  public static void insert(int[][] list, int input) {

    list[CURRENT][NEXT] = CURRENT + 1;
    list[CURRENT][KEY] = input;
    list[CURRENT][PREV] = BEFORE;

    BEFORE = CURRENT;
    CURRENT++;
  }

  public static void delete(int[][] list, int input) {
    int i = START;
    while (list[i][KEY] != input) {
      i = list[i][NEXT];
    }

    if (i == START) {
      deleteFirst(list);
    } else {
      list[list[i][PREV]][NEXT] = list[i][NEXT];
      list[list[i][NEXT]][PREV] = list[i][PREV];
    }
  }

  public static void deleteFirst(int[][] list) {
    list[list[START][NEXT]][PREV] = list[START][NEXT];
    START = list[START][NEXT];
  }

  public static void deleteLast(int[][] list) {
    CURRENT--;
    list[list[CURRENT][PREV]][NEXT] = list[CURRENT][NEXT];
    BEFORE = CURRENT;
    CURRENT++;
  }

  public static void printList(int[][] list) {
    int[] print = new int[2000000];
    int index = -1;
    for (int i = START; list[i][NEXT] != -1; i = list[i][NEXT]) {
      index++;
      print[index] = list[i][KEY];
    }

    while (index != 0) {
      System.out.print(print[index] + " ");
      index--;
    }
    System.out.println(print[0]);
  }
}

