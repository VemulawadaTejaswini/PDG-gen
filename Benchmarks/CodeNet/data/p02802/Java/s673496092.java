import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    HashSet<Integer> rightAnswer = new HashSet<Integer>();
    int wrongs = 0;
    
    for (int i=0; i<m; i++) {
      Integer p = sc.nextInt();
      String answer = sc.next();
      
      if (rightAnswer.contains(p)) {
        continue;
      }
      if (answer.equals("WA")) {
        wrongs ++;
      }
      else {
        rightAnswer.add(p);
      }
    }
    System.out.println(rightAnswer.size() + " " + String.valueOf(wrongs));
  }
}