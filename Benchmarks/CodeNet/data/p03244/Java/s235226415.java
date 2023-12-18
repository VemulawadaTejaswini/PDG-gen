import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    HashMap<Integer, Integer> evenMap = new HashMap<>();
    HashMap<Integer, Integer> oddMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      int v = scn.nextInt();
      if (i % 2 == 0) {
        if (!evenMap.containsKey(v)) {
          evenMap.put(v, 1);
        } else {
          evenMap.put(v, evenMap.get(v) + 1);
        }
      } else {
        if (!oddMap.containsKey(v)) {
          oddMap.put(v, 1);
        } else {
          oddMap.put(v, oddMap.get(v) + 1);
        }
      }
    }

    List<Map.Entry<Integer, Integer>> evenList = new ArrayList<>(evenMap.entrySet());
    List<Map.Entry<Integer, Integer>> oddList = new ArrayList<>(oddMap.entrySet());
    Collections.sort(evenList, (e1, e2) -> -e1.getValue().compareTo(e2.getValue()));
    Collections.sort(oddList, (e1, e2) -> -e1.getValue().compareTo(e2.getValue()));

    int evenMostFreq = evenList.get(0).getKey();
    int oddMostFreq = oddList.get(0).getKey();

    int ans = 0;
    if (evenMostFreq != oddMostFreq) {

      evenList.get(0).setValue(0);
      oddList.get(0).setValue(0);
      for (Map.Entry<Integer, Integer> entry : evenList) {
        ans += entry.getValue();
      }
      for (Map.Entry<Integer, Integer> entry : oddList) {
        ans += entry.getValue();
      }

    } else {

      int ans1 = 0;
      int ans2 = 0;

      if (evenList.size() == 1 && oddList.size() == 1) {
        ans = evenList.size() / 2;

      } else if (evenList.size() == 1) {
        oddList.get(1).setValue(0);
        for (Map.Entry<Integer, Integer> entry : oddList) {
          ans += entry.getValue();
        }
      } else if (oddList.size() == 1) {
        evenList.get(1).setValue(0);
        for (Map.Entry<Integer, Integer> entry : evenList) {
          ans += entry.getValue();
        }
      } else {
        int tmp = oddList.get(1).getValue();
        oddList.get(1).setValue(0);
        for (Map.Entry<Integer, Integer> entry : evenList) {
          ans1 += entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : oddList) {
          ans1 += entry.getValue();
        }

        oddList.get(1).setValue(tmp);
        evenList.get(1).setValue(0);
        for (Map.Entry<Integer, Integer> entry : evenList) {
          ans2 += entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : oddList) {
          ans2 += entry.getValue();
        }

        ans = Math.min(ans1, ans2);

      }
    }

    System.out.println(ans);

  }

}
