import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          int num = scan.nextInt();
          int Bsum = 0;
          List<Integer> array = new ArrayList<>();
          
          int arrayNum = (int)Math.pow(2, num);
          for (int i = 0; i < arrayNum; i++) {
				int a = scan.nextInt();
				array.add(a);
			}
          
          Collections.sort(array, Collections.reverseOrder());
          List<Integer> exist = new ArrayList<>();
          exist.add(array.get(0));
          boolean ans = true;
          
          for (int i = 1; i < array.size(); i++) {
 			List<Integer> a = new ArrayList<>();
            for(int j=0; j<exist.size(); j++) {
              	if(i >= array.size()) break;
                if(exist.get(j) > array.get(i)) {
                  a.add(array.get(i));
                  i++;
                } else {
                 ans = false; 
                }
            }
            exist.addAll(a);
           }
          if(ans){
            System.out.println("Yes");
          }else {
            System.out.println("No");
          }
          
        }
    }
}