import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);
    	int N = sc.nextInt();
    	long K = sc.nextLong();
    	int[] A = new int[N+1];
    	for(int i=1;i<=N;i++) {
    		A[i] = sc.nextInt();
    	}

    	int[] history = new int[N+1];
    	history[0] = 1;
    	int now = 1;
    	int count = 0;
    	int loopstart2 = 0;
    	int loopend2 = 0;

    	while (count<N) {
    		count = count+1;
    		now = A[now];
    		history[count] = now;
    		for(int i=0;i<count;i++) {
    			if(history[i]==now) {
    				loopstart2 = i;
    				loopend2 = count;
    			}
    		}
    		if(loopend2>=1) {
    			break;
    		}
    	}
//    	System.out.println("start->"+loopstart2+"end->"+loopend2);
    	int loopstart = 0;
//    	int loopend = 0;
//    	System.out.println("a");
//    	for(int i = 0;i<N;i++){
//    		for(int j = i+1;j<N;j++) {
//    			if(history[i]==history[j]) {
//    				loopstart = i;
//    				loopend = j;
//    				break;
//    			}
//    		}
//    		if(loopend>0) {
//    			break;
//    		}
//    	}
    	int loop = loopend2 - loopstart2;
//    	System.out.println("start->"+loopstart+"end->"+loopend);
    	long looptime = K -loopstart2;
    	int q = (int) (looptime % loop);
    	System.out.println(history[loopstart2+q]);

    }
}