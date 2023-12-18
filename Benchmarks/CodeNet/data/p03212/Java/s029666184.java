import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int digit = String.valueOf(N).length();

    ArrayList<Integer> combis = new ArrayList<>();
    for (int i = digit; i >= 3; i--) {
      calcCombi("", i, combis);
    }
    ArrayList<Integer> validCombis = new ArrayList<>();
    for (int combi : combis) {
      if (combi <= N) {
        validCombis.add(combi);
      }
    }

    System.out.println(validCombis.size());

  }

  public static void calcCombi(String str, int D, ArrayList<Integer> combis) {
    if (D == 0) {
      boolean exists3 = false;
      boolean exists5 = false;
      boolean exists7 = false;
      for (char digit : str.toCharArray()) {
        switch (digit) {
        case '3':
          exists3 = true;
          break;
        case '5':
          exists5 = true;
          break;
        case '7':
          exists7 = true;
          break;
        }

        if (exists3 && exists5 && exists7) {
          combis.add(Integer.parseInt(str));
          break;
        }
      }
    } else {
      calcCombi(str + '3', D - 1, combis);
      calcCombi(str + '5', D - 1, combis);
      calcCombi(str + '7', D - 1, combis);
    }

  }

}