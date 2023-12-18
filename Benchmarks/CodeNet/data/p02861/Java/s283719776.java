import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
	  
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  ArrayList<ArrayList<Map<String, Integer>>> allList = new ArrayList<>();

	  
	  for (int i = 0; i < n; i++) {
		ArrayList<Map<String, Integer>> piList = new ArrayList<>();
		Map<String, Integer> xMap = new HashMap<>();
		Map<String, Integer> yMap = new HashMap<>();
		int x = scanner.nextInt();
		xMap.put("x", x);
		int y = scanner.nextInt();
		yMap.put("y", y);
		piList.add(xMap);
		piList.add(yMap);
		allList.add(piList);
	}
	  scanner.close();
	  for(ArrayList<Map<String, Integer>> list :allList) {
		  
	  }
	  ArrayList<Double> resultList = new ArrayList<>();
	  double total = 0;
	 for (int i = 0; i < allList.size(); i++) {
		for (int j = 0; j < allList.size(); j++) {
			if (i != j) {
				ArrayList<Map<String, Integer>> atargetList = allList.get(i);
				ArrayList<Map<String, Integer>> btargetList = allList.get(j);
				double xdiff = Math.pow((atargetList.get(0).get("x") - btargetList.get(0).get("x")), 2);
				double ydiff = Math.pow((atargetList.get(0).get("y") - btargetList.get(0).get("y")), 2);
				double result = Math.sqrt(xdiff+ydiff);
				resultList.add(result);
			}
		}
	}
	 double result = 0;
	 for (int i = 0; i < resultList.size(); i++) {
		total = total + resultList.get(i);
	}
	 result = total / (resultList.size());
	 System.out.println(result);

  }
}