import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] ary = new int[N];
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextInt()+1;
    	}
    	sc.close();
    	Queue<Integer> queue = new ArrayDeque<>();
    	int max = 0;
    	int s = 0;
    	for(int i = 0; i < N; i++){
    		s += ary[i];
    		queue.add(ary[i]);
    		if(queue.size() > K){
    			s -= queue.peek();
    			queue.poll();
    		}
    		if(queue.size() == K){
    			max = Math.max(s, max);
    		}
    	}
    	double ans = max;
    	ans /= 2;
    	System.out.println(ans);
    }
}