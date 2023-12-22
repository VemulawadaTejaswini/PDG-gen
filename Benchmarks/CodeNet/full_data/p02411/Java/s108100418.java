import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> testScore = new ArrayList<String>();
    int m = 0;
    int f = 0;
    int r = 0;
    while (true) {
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      if(m == -1 && f == -1 && r == -1){
        //testScore.add("");
         break;
      }else if (m == -1 || f == -1) {
        testScore.add("F");
      } else if ((m + f) >= 80) {
        testScore.add("A");
      } else if ((m + f) >= 65 && (m + f) < 80) {
        testScore.add("B");
      } else if ((m + f) >= 50 && (m + f) < 65 || r >= 50) {
        testScore.add("C");
      } else if ((m + f) >= 30 && (m + f) < 50 && r < 50) {
        testScore.add("D");
      } else if ((m + f) < 30) {
        testScore.add("F");
      }
    }

    for(String testResult: testScore){
      System.out.println(testResult);
    }

  }
}
