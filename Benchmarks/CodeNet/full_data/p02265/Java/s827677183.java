import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		Deque<Integer> deque = new ArrayDeque<Integer>(2000000);
		
		for(int t = 0; t < n; t++){
			String input = sc.next();
			
			if("insert".equals(input)){
				final int x = sc.nextInt();
				
				deque.addFirst(x);
			}else if("delete".equals(input)){
				final int x = sc.nextInt();
				
				deque.remove(x);
			}else if("deleteFirst".equals(input)){
				deque.pollFirst();
			}else if("deleteLast".equals(input)){
				deque.pollLast();
			}
		}
		
		boolean first = true;
		for(int i : deque){
			System.out.print((first ? "" : " ") + i);
			
			if(first){
				first = false;
			}
		}
		System.out.println();
		
	}

}

class Scanner {
	
	private BufferedReader br;
	private StringTokenizer tok;
	
	public Scanner(InputStream is) throws IOException{
		br = new BufferedReader(new InputStreamReader(is));
		getLine();
	}
	
	private void getLine() throws IOException{
		while(tok == null || !hasNext()){
			tok = new StringTokenizer(br.readLine());
		}
	}
	
	private boolean hasNext(){
		return tok.hasMoreTokens();
	}
	
	public String next() throws IOException{
		if(hasNext()){
			return tok.nextToken();
		}else{
			getLine();
			return tok.nextToken();
		}
	}
	
	public int nextInt() throws IOException{
		if(hasNext()){
			return Integer.parseInt(tok.nextToken());
		}else{
			getLine();
			return Integer.parseInt(tok.nextToken());
		}
	}
	
	public long nextLong() throws IOException{
		if(hasNext()){
			return Long.parseLong(tok.nextToken());
		}else{
			getLine();
			return Long.parseLong(tok.nextToken());
		}
	}
	
	public double nextDouble() throws IOException{
		if(hasNext()){
			return Double.parseDouble(tok.nextToken());
		}else{
			getLine();
			return Double.parseDouble(tok.nextToken());
		}
	}
}