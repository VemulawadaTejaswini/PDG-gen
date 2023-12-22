
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    int ans = 0;

    Queue<Long> qA = new ArrayDeque<>();
    Queue<Long> qB = new ArrayDeque<>();

    for(int i = 0; i < N; i++) {
    	qA.add(sc.nextLong());
    }
    for (int i = 0; i < M; i++) {
    	qB.add(sc.nextLong());
    }
    while(0 < K) {
    	
    	//読書
    	if (qB.size() == 0 && qA.size() == 0) {
    		break;
    	} else if (qB.size() == 0) {
    		K -= qA.remove();
    	} else if (qA.size() == 0) {
    		K -= qB.remove();
    	} else {
    		if (qA.element() < qB.element()) {
    			K -= qA.remove();
    		} else {
    			K -= qB.remove();
    		}
    	}
    	
    	//読書結果判定
    	if(K < 0) {
    		break;
    	}
    	ans++;
    }

    System.out.println(ans);
  }
}