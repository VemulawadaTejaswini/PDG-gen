import java.util.*;

interface JudgeInterface {
  String putQuery(String query);
}

class ExternalJudge implements JudgeInterface {
  final Scanner scanner;
  
  ExternalJudge() {
    scanner = new Scanner(System.in);
  }
  
  public String putQuery(String query) {
    if (query != null) {
      System.out.println(query);
    }
    return scanner.nextLine();
  }
}

class Judge implements JudgeInterface {
  final char[] secrets;
  final int n;
  
  boolean first;
  int count;
  
  Judge(char[] secrets) {
    this.secrets = secrets;
    this.n = secrets.length / 2;
    this.first = true;
    this.count = 0;
  }
  
  public String putQuery(String query) {
    if (first) {
      first = false;
      return String.format("%d", secrets.length / 2);
    }
    Scanner s = new Scanner(query);
    char c = s.next().charAt(0);
    switch (c) {
      case '?':
        count++;
        if (count > 210) {
          throw new RuntimeException();
        }
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < n; i++) {
          int a = s.nextInt();
          if (secrets[a - 1] == 'R') {
            countRed++;
          } else {
            countBlue++;
          }
        }
        
        if (countRed > countBlue) {
          return "Red";
        } else {
          return "Blue";
        }
      case '!':
        char[] cs = s.next().toCharArray();
        boolean equals = true;
        for (int i = 0; i < 2 * n; i++) {
          if (cs[i] != secrets[i]) {
            equals = false;
          }
        }
        
        if (equals) {
          System.err.println("SUCCESS");
        } else {
          System.err.println("FAIL");
        }
        return null;
      default:
        throw new RuntimeException();
    }
  }
}

class JudgeWrapper {
  JudgeInterface judgeInterface;
  
  JudgeWrapper(JudgeInterface judgeInterface) {
    this.judgeInterface = judgeInterface;
  }
  
  String putQuery(String query) {
    System.err.println("Query: " + query);
    String judgeResponse = judgeInterface.putQuery(query);
    System.err.println("Judge: " + judgeResponse);
    return judgeResponse;
  }
}

class Solver {
  JudgeWrapper judgeWrapper;
  int n;
  
  Solver(JudgeWrapper judgeWrapper) {
    this.judgeWrapper = judgeWrapper;
  }
  
  private String createQuery(List<Integer> indexes) {
    StringBuffer sb = new StringBuffer();
    sb.append("?");
    for (int index : indexes) {
      sb.append(" ");
      sb.append(index);
    }
    return sb.toString();
  }
  
  private String createQuery(int headIndex) {
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      indexes.add(headIndex + i);
    }
    return createQuery(indexes);
  }
  
  
  public void solve() {
    String judgeResponse = judgeWrapper.putQuery(null);
    
    n = Integer.parseInt(judgeResponse);
    String query = judgeWrapper.putQuery(createQuery(1));
    String headColor = query;
    int l = 1;
    int r = n + 1;
    while (r - l > 1) {
      int mid = (r + l) / 2;
      query = createQuery(mid);
      judgeResponse = judgeWrapper.putQuery(query);      
      if (judgeResponse.equals(headColor)) {
        l = mid;
      } else {
        r = mid;
      }
    }
    
    char[] answers = new char[2 * n + 1];
    if (headColor.equals("Red")) {
      answers[l] = 'R';
      answers[l + n] = 'B';
    } else {
      answers[l] = 'B';
      answers[l + n] = 'R';
    }
    
    for (int i = 1; i <= 2 * n; i++) {
      if (i == l || i == l + n) {
        continue;
      }
      
      List<Integer> indexes = new ArrayList<>();
      if (i < l || l + n < i) {
        for (int j = l + 1; j < l + n; j++) {
          indexes.add(j);
        }
        indexes.add(i);
      } else {
        for (int j = 1; j < l; j++) {
          indexes.add(j);
        }
        for (int j = l + n + 1; j <= 2 * n; j++) {
          indexes.add(j);
        }
        indexes.add(i);
      }
      
      query = createQuery(indexes);
      judgeResponse = judgeWrapper.putQuery(query);      
      if (judgeResponse.equals("Red")) {
        answers[i] = 'R';
      } else {
        answers[i] = 'B';
      }
    }
    
    String finalQuery = "! " + new String(answers, 1, 2 * n);
    System.err.println(finalQuery);
    System.out.println(finalQuery);
  }
}

class Main {
  public static void main(String[] args) {
//    JudgeInterface judgeInterface = new Judge("RRRBBBRRBBRRBB".toCharArray());
    JudgeInterface judgeInterface = new ExternalJudge();
    JudgeWrapper judgeWrapper = new JudgeWrapper(judgeInterface);
    Solver solver = new Solver(judgeWrapper);
    solver.solve();
  }
}
