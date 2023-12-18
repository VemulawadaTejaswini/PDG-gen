import java.util.*;

public class Main {

	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String S = sc.next();
    	int Q = sc.nextInt();

    	char[] charArray = S.toCharArray();

    	for (int i=0; i<Q; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c;
        	char[] d;
        	if(a==1){
            	d=sc.next().toCharArray();
        		charArray[b-1] = d[0];
        	}else{
            	c=sc.nextInt();
        		Set<Character> uniqueChar = new HashSet<Character>();
        		for(int j=b-1; j <= c-1; j++ ){
        			uniqueChar.add(charArray[j]);
        		}
        		System.out.println(uniqueChar.size());
        	}
    	}
    	
    	sc.close();
    	
	}
	
    public static void main(String[] args) {
        new Main().run();
    }
}