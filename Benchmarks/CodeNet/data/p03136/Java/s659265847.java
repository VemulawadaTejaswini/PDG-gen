import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String vertex = sc.nextLine();
      Integer N = Integer.parseInt(vertex);
      String lineList = sc.nextLine();
      String lines[] = lines.split(" ");
 
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int index=0; index<lineList.length; index++) {
		list.add(Integer.parseInt(lineList[index]));
      }
      
      Integer[] numbers = list.toArray(new Integer[list.size()]);
      Arrays.sort(numbers, Collections.reverseOrder());
      
      Integer largestLine = numbers[0];
      int lineSum;
      for(int i = 0; i<numbers.length; i++) {
        lineSum += numbers[i];
      }
      if (largetsLine < (lineSum - largestLine)) {
        System.out.print("Yes");
      } else {
        System.out.print("No");
      }
	}
}