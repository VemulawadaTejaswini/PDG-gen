import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        Arrays.sort(arr);
        
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        
        left.add(arr[0]);
        right.add(arr[0]);
        
        for(int i = n-1; i >= (n-1)/2 + 1; i -= 2){
            left.add(arr[i]);
            left.add(arr[n-i]);
        }
        for(int i = n-2; i >= n/2; i -= 2){
            right.add(arr[i]);
            right.add(arr[n-i]);
        }

        System.out.println(listSum(left, 0, left.size()) + listSum(right, 0, right.size()));
    }
    
    private static int listSum(LinkedList<Integer> ll, int val, int size){
        if(size == 1) return val;
        
        int temp = ll.poll();
        
        return listSum(ll, val + Math.abs(temp - ll.peek()), --size);
    }
}
