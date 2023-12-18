import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int numOfChild = s.nextInt();
      int numOfOkasi = s.nextInt();
      Integer[] childs = new Integer[numOfChild];
      for(int i = 0; i < numOfChild; i++) {
      	childs[i] = s.nextInt();
      }
      
      Arrays.sort(childs);
      int okasi = numOfOkasi;
      int first = 0;
      for(int i = 0; i < numOfChild; i++) {
      	okasi -= childs[i];
        if(i != numOfChild -1 && okasi >= 0) first++;
        else if(i == numOfChild - 1 && okasi == 0) first++;
      }
     
      
      Arrays.sort(childs, Comparator.reverseOrder());
      okasi = numOfOkasi;
      int second = 0;
       for(int i = 0; i < numOfChild; i++) {
      	okasi -= childs[i];
        if(i != numOfChild -1 && okasi >= 0) second++;
         else if(i == numOfChild - 1 && okasi == 0) second++;
      }
      
      int ans = first > second ? first : second;
      System.out.println(ans);
    }
}