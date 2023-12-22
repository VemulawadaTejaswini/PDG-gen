import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(" ");
        int K = Integer.parseInt(input[2]);
        Deque<Integer> que_a = new ArrayDeque<>();
        Deque<Integer> que_b = new ArrayDeque<>();
        int max = 1000000009;
        int book = 0;
        input = sc.nextLine().split(" ");
        for(String str : input){
            que_a.add(Integer.parseInt(str));
        }
        input = sc.nextLine().split(" ");
        for(String str : input){
            que_b.add(Integer.parseInt(str));
        }
        
        while(true){
            int t = 0;
            Integer a = que_a.peekFirst();
            Integer b = que_b.peekFirst();
            if(a == null && b == null) break;
            if(a == null) a = max;
            if(b == null) b = max;
            
            if(a < b) t = que_a.pollFirst();
            else t = que_b.pollFirst();
            if(t > K) break;
            K -= t;
            book++;
        }
        System.out.println(book);
        
        
    }
}