import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int[] x = new int[N];
    for(int i=0;i<N;i++) x[i] = scanner.nextInt()-A;
    Arrays.sort(x);

    int zeros = 0;
    List<Integer> negatives = new ArrayList<>();
    List<Integer> positives = new ArrayList<>();
    for(int i=0;i<N;i++) {
      if(x[i]==0) zeros++;
      else if(x[i] > 0) positives.add(x[i]);
      else negatives.add(-x[i]);
    }

    Map<Integer, Integer> positiveCounts = count(positives);
    Map<Integer, Integer> negativeCounts = count(negatives);

    long totalCount = 0;
    for(Map.Entry<Integer, Integer> pEntry : positiveCounts.entrySet()) {
      for(Map.Entry<Integer, Integer> nEntry : negativeCounts.entrySet()) {
        if(pEntry.getKey() == nEntry.getKey()) {
          totalCount += (pEntry.getValue()*nEntry.getValue());
        }
      }
    }

    long zeroCombo = (long)Math.pow(2, zeros)-1;
    System.out.println(totalCount * (zeroCombo+1) + zeroCombo);

    scanner.close();
  }

  private static Map<Integer, Integer> count(List<Integer> list) {
    Map<Integer, Integer> retVal = new HashMap<>();

    for(int i=1;i<Math.pow(2, list.size());i++) {
      int sum = 0;
      for(int j=0;j<list.size();j++) {
        sum += ((i>>j)%2 == 1)? list.get(j) : 0;
      }

      if(retVal.get(sum) == null) retVal.put(sum, 1);
      else retVal.put(sum, retVal.get(sum)+1);
    }

    return retVal;
  }
}
