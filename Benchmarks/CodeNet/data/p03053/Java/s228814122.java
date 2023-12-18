import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < line.length(); j++) {
        A[i][j] = line.charAt(j);
      }
    }
    
    int ans = resolve(A);
    
    System.out.println(ans);
    //System.out.println(Arrays.deepToString(A));
  }

  private static int resolve(char[][] a) {
    
    // scan
    List<List<Integer>> testList = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == '#') {
          if (!allBlack(a, i, j)) {
            // mark
            testList.add(Arrays.asList(i, j));
          }
        }
      }
    }
    
    int count = 0;
    while (testList.size() > 0) {
      List<List<Integer>> newTestList = new ArrayList<>();
      for (List<Integer> test : testList) {
        mark(a, test.get(0), test.get(1), newTestList);
      }
      for (List<Integer> test : newTestList) {
        a[test.get(0)][test.get(1)] = '#';
      }
      if (newTestList.size() > 0) {
        count++;
      }
      testList = newTestList;
    }
    return count;
  }
  
  private static void mark(char[][] a, int i, int j, List<List<Integer>> mark) {
    // up
    if (0 < i && a[i-1][j] == '.') {
      mark.add(Arrays.asList(i-1, j));
    }
    // down
    if (i < a.length - 1 && a[i+1][j] == '.') {
      mark.add(Arrays.asList(i+1, j));
    }
    // left
    if (0 < j && a[i][j-1] == '.') {
      mark.add(Arrays.asList(i, j-1));
    }
    //right
    if (j < a.length - 1 && a[i][j+1] == '.') {
      mark.add(Arrays.asList(i, j+1));
    }
  }
  
  private static boolean allBlack(char[][] a, int i, int j) {
    // up
    return (i == 0 || a[i-1][j] == '#')
    // down
      && (i == a.length - 1 || a[i+1][j] == '#')
    // left
      && (j == 0 || a[i][j-1] == '#')
    // right
      && (j == a[i].length - 1 || a[i][j+1] == '#');
  } 
}
