import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    boolean keyBreak = false;
    List<String> scores = new ArrayList<String>();
    List<String> ranks = new ArrayList<String>();
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.equals("0,0")) {
        keyBreak = true;
        Collections.sort(scores);
        Collections.reverse(scores);
        int rank = 0;
        int preScore = Integer.MAX_VALUE;
        for (String el : scores) {
          String[] works = el.split(",");
          int score = Integer.parseInt(works[0]);
          if (preScore > score) {
            rank++;
          }
          ranks.add(works[1] + "," + rank);
          preScore = score;
        }
        continue;
      }
      if (keyBreak) {
        for (String el : ranks) {
          String[] works = el.split(",");
          if (!line.equals(works[0])) {
            continue;
          }
          out += works[1] + "\n";
        }
      } else {
        String[] works = line.split(",");
        if (works[1].length() == 1) {
          works[1] = "0" + works[1];
        }
        scores.add(works[1] + "," + works[0]);
      }
    }
    System.out.print(out);
  }
}