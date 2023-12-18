import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
   
    public static Integer listAll(List<Integer> list, Integer[] intArr, int n, Integer minVal) {
        if (n == 0) {
            int temMinValue = Math.abs(list.get(0)-0);
            for(int i = 1; i<list.size(); i++) {
            	temMinValue += Math.abs(list.get(i)-list.get(i-1));
            }
            if(minVal == null || minVal > temMinValue) {
            	minVal = temMinValue;
            }
            return minVal;
        }
        for (Integer integer : intArr) {                    
            if (!list.contains(integer)) { 
                list.set(list.size() - n, integer);
            } else {                                
                continue;
            }
            minVal =listAll(list, intArr, n - 1, minVal);   
            list.set(list.size() - n, -99999999);        
        }
        return minVal;
    }

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
        Integer[] numbers = new Integer[N];
		for(int i = 0; i < N; i ++) {
			numbers[i] = in.nextInt();
		}

        if (M <= 0 || numbers == null) {
            return;
        }
        List<Integer> stringList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            stringList.add(-99999999);
        }
        Integer minVal = null;
        int resultValue = listAll(stringList, numbers, M, minVal);
        System.out.println(resultValue);
    }
}