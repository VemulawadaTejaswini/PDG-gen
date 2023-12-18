import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        Integer N = s.nextInt();
        long K = Long.parseLong(s.next());
        int[] A = new int[N+1];
        for(int i = 1; i <= N; i++) {
        	A[i] = s.nextInt();
        }
 
        StringBuilder searchLoop = new StringBuilder("@1@");
        int loop = 0;
        int current = 0;
        int index = 1;
        for(int i = 0; i < N; i++) {
        	int candidate = 0;
        	current = index;
        	index = A[index];
        	if((candidate = searchLoop.indexOf("@" + String.valueOf(index) + "@")) > -1) {
        		loop = candidate;
        		break;
        	}
        	searchLoop.append(String.valueOf(index));
        }
 
        long mod = ((K - loop) % (searchLoop.length() - loop));
        int modInt = (int)mod;
        if(K < loop)
        	System.out.println(searchLoop.charAt((int)K));
        else {
        	int strIndex = loop + modInt;
        	int next = 0;
        	while(searchLoop.charAt(strIndex + next) != '@') {
        		System.out.print(searchLoop.charAt(strIndex + next++));
        	}
        	System.out.println();
        }
    }
}