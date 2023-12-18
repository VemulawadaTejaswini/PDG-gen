import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        
        int max = 0;
        int combinationCount = (int)Math.pow(2, n);
        for (int i = 0; i < combinationCount; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            while (binaryNumber.length() < n) {
                binaryNumber = "0" + binaryNumber;
            }
            
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                char c = binaryNumber.charAt(j);
                if (c == '0') {
                    list.add(array[j]);
                } else {
                    list.add(24 - array[j]);
                }
            }
            
            list.add(0);
            list.add(24);
            
            list.sort(Comparator.naturalOrder());
            
            int min = 124;
            for (int j = 0; j < n + 1; j++) {
                int dif = list.get(j + 1) - list.get(j);
                min = Math.min(min, dif);
            }
            
            max = Math.max(max, min);
        }
        
        System.out.println(max);
    }
}
