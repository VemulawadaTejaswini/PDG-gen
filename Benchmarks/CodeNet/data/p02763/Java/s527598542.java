import java.util.*;

public class Main {

	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	char[] charArray = sc.next().toCharArray();
    	int Q = sc.nextInt();
    	
        @SuppressWarnings("unchecked")
		TreeSet<Integer>[] table = (TreeSet<Integer>[])new TreeSet<?>[26]; // new TreeSet<Integer>[26]は通らない

        // 0 → a, 25 → z
        for(int i=0;i<26;i++){
        	table[i] = new TreeSet<Integer>();
        }

        // a-z別index対応表を作る
        for(int i=0; i<N; i++){
        	table[charArray[i]-'a'].add(i);
        }
    	

    	for (int i=0; i<Q; i++) {
        	if(sc.nextInt()==1){
        		int b=sc.nextInt();
        		char[] d = sc.next().toCharArray();
        		char tmp = charArray[b-1];
        		charArray[b-1] = d[0];

        		table[tmp-'a'].remove(b-1);
        		table[d[0]-'a'].add(b-1);
        		
        	}else{
        		int begin=sc.nextInt();
        		int end=sc.nextInt();
        		int n = 0;
        		
        		for(int j=0; j < 26; j++){
        			Integer x = table[j].higher(begin - 2);
        			if(x != null && x <= end-1){
        				n++;
        			}
        		}
            	System.out.println(n);
            	
            	/* 遅い
            	int alCnt = 0;
            	for(char al = 'a'; al <= 'z'; al++){
            		if(subS.indexOf(al)!=-1){
            			alCnt++;
            		}
            	}
            	System.out.println(alCnt);
            	*/
            	
        		/* 遅い
            	Set<Character> uniqueChar = new HashSet<Character>();
        		for(int j=b-1; j <= c-1; j++ ){
        			uniqueChar.add(charArray[j]);
        		}
        		System.out.println(uniqueChar.size());
        		*/
        	}
    	}
    	
    	sc.close();
    	
	}
	
    public static void main(String[] args) {
        new Main().run();
    }
}