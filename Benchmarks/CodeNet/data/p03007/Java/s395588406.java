import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        int minIndex = 0;
        int maxIndex = 0;
        int min = a.get(minIndex);
        int max = a.get(maxIndex);
        if (min == max) {
            maxIndex = 1;
            max = a.get(maxIndex);
        }

        int index = 0;
        while (index < n) {
            if (min > a.get(index)) {
                min = a.get(index);
                minIndex = index;
            }
            index++;
        }
        index = 0;
        while (index < n) {
            if (max < a.get(index)) {
                max = a.get(index);
                maxIndex = index;
            }
            index++;
        }
        
        a.remove(minIndex);
        a.remove(maxIndex - 1);

        int result = min;
        index = 0;
        while (index < n -2) {
            result = result - a.get(index);
            index++;
        }
        result = max - result;
        System.out.println(result);

        index = 0;
        while (index < n-2) {
            System.out.println(min + " " + a.get(index));
            min = min - a.get(index);
            index++;
        }
        System.out.println(min + " " + max);
	}
}
