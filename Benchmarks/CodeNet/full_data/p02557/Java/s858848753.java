import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        Integer []arr = new Integer[n];
        int [] arr2 = new int[n];
        for (int pos = 0; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
        }
        inp = buffer.readLine().split(" ");
        for (int pos = 0; pos < n; pos++) {
            arr2[n-pos-1] = Integer.parseInt(inp[pos]);
        }
        Queue<Integer>balancedPos = new LinkedList<>(), unbalancedPos = new LinkedList<>();
        for (int pos = 0; pos < n; pos++) {
            if (arr[pos] == arr2[pos]){
                if (!unbalancedPos.isEmpty() && arr2[pos]!=arr[unbalancedPos.peek()]){
                    int i = unbalancedPos.peek();
                    arr2[pos] = arr2[pos]^arr2[i]^(arr2[i] = arr2[pos]);
                    unbalancedPos.add(pos);
                }
                else
                    balancedPos.add(pos);
            }
            else {
                if (!balancedPos.isEmpty() && arr[balancedPos.peek()]!=arr2[pos]){
                    int i = balancedPos.poll();
                    arr2[i] = arr2[pos]^arr2[i]^(arr2[pos] = arr2[i]);
                    unbalancedPos.add(i);
                }
                else
                    unbalancedPos.add(pos);
            }
        }
        boolean check = true;
        for (int pos = 0; pos < n; pos++) {
            if (arr[pos] == arr2[pos]){
                check = false;
                break;
            }
        }
        if (!balancedPos.isEmpty() || !check)
            System.out.println("No");
        else {
            System.out.println("Yes");
            for (int num : arr2) {
                System.out.print(num + " ");
            }
        }
    }
}
