import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    List<Double> list = new ArrayList<Double>();
    List<Integer> counter = new ArrayList<Integer>();
    double num = 0;
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      	num = Double.parseDouble(sc.nextLine());
        list.add(num);
      	for (int i = 0; i < list.size - 1; i++) {
        	for (int j = i + 1; j < list.size; j++) {
            	double x = list.get(i) * list.get(j);
            	if(int(x) == x) {
            		counter.add(x);
            	} else {

		}
          }
      }
    }
    System.out.print(counter.size());
  }
}