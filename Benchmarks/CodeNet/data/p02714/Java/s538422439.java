import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      Map<Character, List<Integer>> freqMap = new HashMap<>();
      freqMap.put('R', new ArrayList<>());
      freqMap.put('G', new ArrayList<>());
      freqMap.put('B', new ArrayList<>());

      for(int i = 0; i < n; i++) {
        freqMap.get(s.charAt(i)).add(i);
      }
      long sum = (long)freqMap.get('R').size() * (long)freqMap.get('G').size() * (long)freqMap.get('B').size();

      for(int i = 0; i < n; i++) {
        char leftChar = s.charAt(i);
        for(int j = i + 1; j < n; j++) {
          char midChar = s.charAt(j);
          if(leftChar == midChar) continue;
          int k = j * 2 - i;
          if(k >= n) continue;
          char rightChar = s.charAt(k);
          if(rightChar != midChar && rightChar != leftChar)
            sum--;
        }
      }
      System.out.println(sum);
  }
}