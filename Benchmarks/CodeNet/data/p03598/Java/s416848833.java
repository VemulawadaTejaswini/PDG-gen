import java.util.*;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    List<Integer> xList = new ArrayList<Integer>();
    
    while (scan.hasNextInt()) {
    	xList.add(Integer.valueOf(scan.nextInt()));
    }
    
    int sum = 0;
    int sumCalcA = 0;
    int sumCalcB = 0;
    
    for (Integer i : xList) {
    	sumCalcA = calcA(i);
    	sumCalcB = calcB(i, k);
    	if (sumCalcA > sumCalcB) {
    		sum += sumCalcB;
    	} else {
    		sum += sumCalcA;
    	}	
    }
	System.out.println(String.valueOf(sum));
	return;
  }
  
  private static int calcA(Integer i){
  	return 2 * i;
  }

  private static int calcB(Integer i, Integer k){
  	return 2 *( k - i);
  }
  
}

