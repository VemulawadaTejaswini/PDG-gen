import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input
        // N M
        // s1 c1
        // s2 c2
        // :
        // si ci
        Scanner sc = new Scanner(System.in);
        double lengthNum = sc.nextInt();
        int hintNum = sc.nextInt();
        int maxIndex = 0;
        List<Integer> hintIndex = new ArrayList<>();
        List<Integer> hintValue = new ArrayList<>();
        for(int i = 0; i < hintNum; i++) {
            int numIndex = sc.nextInt();
            int numValue = sc.nextInt();
            hintIndex.add(numIndex);
            hintValue.add(numValue);
            if(maxIndex < numIndex){
                maxIndex = numIndex;
            }
            for (int j = 0; j < hintIndex.size() - 1; j++) {
                if (hintIndex.get(j) == numIndex) {
                    if (hintValue.get(j) != numValue) {
                        System.out.println(-1);
                        return;
                    } else {
                        hintIndex.remove(i);
                        hintValue.remove(i);
                    }
                }
            }
        }
        int resultNum = 0;
        for(int i = 0; i < hintIndex.size(); i++){
            if(hintIndex.get(i) == maxIndex && hintValue.get(i) == 0){
                System.out.println(-1);
                return;
            }
            resultNum += hintValue.get(i) * Math.pow(10, lengthNum - hintIndex.get(i));
        }
        System.out.println(resultNum);
    }
}
