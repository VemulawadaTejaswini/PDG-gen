import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    List<Integer> room = new ArrayList<Integer>();
    for (int ii = 1; ii <= m; ii++) {
      room.add(ii);
    }
    //while (scanner.hasNext()) {
    for (int ii = 0; ii < n; ii++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int idxx = room.indexOf(x);
      int idxy = room.indexOf(y);
      if (idxx > idxy) {
        room.remove(idxx);
        room.add(idxy, x);
      }
    }
    for (int el : room) {
      out += el + "\n";
    }
    System.out.print(out);
  }
}