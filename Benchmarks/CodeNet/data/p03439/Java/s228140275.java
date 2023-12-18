import java.util.*;

interface Judge {
  String putQuery(String query);
}

class ExternalJudge implements Judge {
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

class InternalJudge implements Judge {
  final String[] seats;
  
  boolean first;
  int count;
  
  InternalJudge(String[] seats) {
    this.seats = seats;
    this.count = 0;
    first = false;
  }
  
  public String putQuery(String query) {
    // Replace here.
    
    if (count >= 20) {
      throw new RuntimeException();
    }
    if (!first) {
      first = true;
      return "" + seats.length;
    }
    count++;
    return seats[Integer.parseInt(query)];
  }
}

class JudgeWrapper {
  Judge judge;
  
  JudgeWrapper(Judge judge) {
    this.judge = judge;
  }
  
  String putQuery(String query) {
    System.err.println("Query: " + query);
    String judgeResponse = judge.putQuery(query);
    System.err.println("Judge: " + judgeResponse);
    return judgeResponse;
  }
}

class Solver {
  enum Gender {
    MALE,
    FEMALE,
    VACANT
  }
  
  JudgeWrapper judgeWrapper;
  int n;
  
  Solver(JudgeWrapper judgeWrapper) {
    this.judgeWrapper = judgeWrapper;
  }
  
  private Gender ask(int seatIndex) {
    String genderString = judgeWrapper.putQuery(String.format("%d", seatIndex));
    if (genderString.equals("Male")) {
      return Gender.MALE;
    } else if (genderString.equals("Female")) {
      return Gender.FEMALE;
    } else {
      return Gender.VACANT;
    }
  }
  
  public void solve() {
    // Replace here.
    
    String judgeResponse = judgeWrapper.putQuery(null);
    n = Integer.parseInt(judgeResponse);
    
    int minIndex = 0;
    int maxIndex = n;
    Gender minGender = ask(0);
    if (minGender == Gender.VACANT) {
      return;
    }
    Gender maxGender = minGender;
    while (true) {
      int midIndex = (maxIndex + minIndex) / 2;
      Gender midGender = ask(midIndex);
      if (midGender == Gender.VACANT) {
        return;
      }
      
      int count = maxIndex - minIndex - 1;
      int countMinSide = midIndex - minIndex - 1;
      int countMaxSide = maxIndex - midIndex - 1;
      
      if (midGender == minGender && countMinSide % 2 == 0) {
        maxIndex = midIndex;
        maxGender = midGender;
      } else if (midGender == maxGender && countMaxSide % 2 == 0) {
        minIndex = midIndex;
        minGender = midGender;
      } else if (midGender != minGender && countMinSide % 2 == 1) {
        maxIndex = midIndex;
        maxGender = midGender;
      } else if (midGender != maxGender && countMaxSide % 2 == 1) {
        minIndex = midIndex;
        minGender = midGender;
      } else {
        throw new RuntimeException();
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    boolean internal = false;
    
    Judge judge;
    if (internal) {
      judge = new InternalJudge(
        new String[]{
          "Male",
          "Female",
          "Male",
          "Female",
          "Male",
          "Female",
          "Male",
          "Female",
          "Male",
          "Vacant",
          
          "Female",
          "Male",
          "Female",
          "Vacant",
          "Vacant",
          "Male",
          "Female",
          "Male",
          "Female",
          "Male",
          
          "Female",
          "Male",
          "Female",
        }
      );
    } else {
      judge = new ExternalJudge();
    }
    JudgeWrapper judgeWrapper = new JudgeWrapper(judge);
    Solver solver = new Solver(judgeWrapper);
    solver.solve();
  }
}

