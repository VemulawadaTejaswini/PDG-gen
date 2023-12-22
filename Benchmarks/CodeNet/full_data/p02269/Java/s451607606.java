import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] inserts = new String[size];
    String[] results = new String[size];
    String find;
    int iIndex = 0;
    int fIndex = 0;

    for (int i = 0; i < size; i++) {
      if (sc.next().equals("insert")) {
        inserts[iIndex] = sc.next();
        iIndex++;
      } else {
        find = sc.next();
        if (iIndex == 0) {
          results[fIndex] = "no";
          fIndex++;
          continue;
        }
        
        for (int j = 0; j < iIndex; j++) {
          if (find.equals(inserts[j])) {
            results[fIndex] = "yes";
            fIndex++;
            break;

          } else if (j + 1 == iIndex) {
            results[fIndex] = "no";
            fIndex++;
            break;
          }
        }
      }
    }

    for (int i = 0; i < fIndex; i++) {
      System.out.println(results[i]);
    }
  }
}

