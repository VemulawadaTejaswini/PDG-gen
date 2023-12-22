import java.util.*; 

public class Main {
  public static void main(String[] args) {
  	List<double> list = new ArrayList<double>();
    List<int> counter = new ArrayList<int>();
    double integerNumber = 0;
    int k = 0;

  	try(Scanner sc = new Scanner(System.in)) {
    	while(integerNumber.hasNext()) {
          	intgerNumber = Double.parseDouble(sc);
        	list.add(integerNumber.next());	
        }
        int count = list.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                double num = list.get(i) * list.get(j)
                if (num = (int)num) {
                	counter.get(k) = num;
                  	k++
                } else {
                    
                }
              	print(counter.size());   
            }
        }
    }
  }
}      