import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        String[] strings = br.readLine().split("\\s");
        for (int i=0; i<strings.length; i++){
            num[i] = Integer.parseInt(strings[i]);
        }

        int q = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split("\\s");
        int sum = 0;
        for (int i=0; i<q; i++){
            if (binarySearch(num, Integer.parseInt(strs[i]))){
                sum++;
            }
        }

        System.out.println(sum);

    }

    private static boolean binarySearch(int[] num, int key) {
        
        // left??¨???????´¢?????´?????´???????´????right??????????°?????´?????????????????´?
        int left = 0;
        int right = num.length;
        
        // ?????¶???????????¶??? <
        while (left < right){
            int mid = (left+right)/2;
            if (key == num[mid]){
                return true;
            }
            else if (key < num[mid]){
                right = mid;
            }
            else {
                left = mid+1;
            }
        }

        return false;
    }
}