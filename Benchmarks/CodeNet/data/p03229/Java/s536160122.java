import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        Deque<Integer> dq = new LinkedList<>();
        dq.add(arr[n-1]);
        long res = 0L;
        int left = 0, right = n - 2;
        while(left < right) {
        	if(Math.abs(arr[left] - dq.peekFirst()) > Math.abs(arr[left] - dq.peekLast())) {
        		res += Math.abs(arr[left] - dq.peekFirst());
        		dq.addFirst(arr[left]);
        	} else {
        		res += Math.abs(arr[left] - dq.peekLast());
        		dq.addLast(arr[left]);
        	}
        	left++;

        	if(Math.abs(arr[right] - dq.peekFirst()) > Math.abs(arr[right] - dq.peekLast())) {
        		res += Math.abs(arr[right] - dq.peekFirst());
        		dq.addFirst(arr[right]);
        	} else {
        		res += Math.abs(arr[right] - dq.peekLast());
        		dq.addLast(arr[right]);
        	}
        	right--;
        }
        if(left == right)
            res += Math.max(Math.abs(arr[left] - dq.peekFirst()), Math.abs(arr[left] - dq.peekLast()));
        System.out.println(res);
    }
}
