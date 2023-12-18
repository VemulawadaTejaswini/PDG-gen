import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
//    HashSet<Integer> rightAnswer = new HashSet<Integer>();
    List<Integer> rightAnswers = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      rightAnswers.add(0);
    }
    int right = 0;

    int wrongs = 0;
    
    for (int i=0; i<m; i++) {
      int p = sc.nextInt();
      String answer = sc.next();
      
      if (rightAnswers.get(p-1)==1) {
        continue;
      }
//      if (rightAnswer.contains(p)) {
 //       continue;
//      }
      if (answer.equals("WA")) {
        wrongs ++;
      }
      else {
        //rightAnswer.add(p);
        rightAnswers.set(p-1, 1);
        right ++;
      }
    }

    System.out.println(String.valueOf(right) + " " + String.valueOf(wrongs));
  }
}