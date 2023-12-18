import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(sc.next());
        arr[1] = Integer.parseInt(sc.next());
        arr[2] = Integer.parseInt(sc.next());
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length/2; i++){
            int bef = 0;
            int aft = 0;
            bef = arr[i];
            aft = arr[arr.length-1-i];
            arr[i] = aft;
            arr[arr.length-1-i] = bef;
            
        }
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
            sum += Math.abs(arr[arr.length-1-i] - arr[arr.length-1-i-1]);
        }
        System.out.println(sum);
    }
}