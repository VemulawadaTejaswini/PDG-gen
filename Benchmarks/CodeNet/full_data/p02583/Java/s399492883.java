import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    Integer[] triangle = new Integer[3];
                    triangle[0] = list.get(i);
                    triangle[1] = list.get(j);
                    triangle[2] = list.get(k);
                    if (triangle[0] != triangle[1] 
                    && triangle[1] != triangle[2] 
                    && triangle[2] != triangle[0]) {
                        if (triangle[0] != 0 
                        && triangle[1] != 0 
                        && triangle[2] != 0) {
                            if (triangle[0] < triangle[1] + triangle[2] 
                            && triangle[1] < triangle[2] + triangle[0] 
                            && triangle[2] < triangle[0] + triangle[1]) {
                                count++;
                            }
                        }
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
}
