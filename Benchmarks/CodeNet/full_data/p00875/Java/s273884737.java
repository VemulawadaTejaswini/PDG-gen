import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Try{
		int count;
		String str;
		
		public Try(int count, String str) {
			super();
			this.count = count;
			this.str = str;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			String[] from = new String[n];
			String[] to = new String[n];
			
			for(int i = 0; i < n; i++){
				from[i] = sc.next();
				to[i] = sc.next();
			}
			
			final String init = sc.next();
			final String purpos = sc.next();
			
			LinkedList<Try> queue = new LinkedList<Try>();
			queue.add(new Try(0, init));
			
			boolean found = false;
			while(!queue.isEmpty()){
				Try inst = queue.poll();
				
				if(purpos.equals(inst.str)){
					found = true;
					System.out.println(inst.count);
					break;
				}else if(purpos.length() < inst.str.length()){
					continue;
				}
				
				for(int i = 0; i < n; i++){
					final String changed = inst.str.replaceAll(from[i], to[i]);
					
					if(!changed.equals(inst.str)){
						queue.add(new Try(inst.count + 1, changed));
					}
				}
			}
			
			if(!found){
				System.out.println(-1);
			}
		}
		
	}

}