import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static class Insect implements Comparable<Insect>{
		char[] ch;
		int sec;
		
		public Insect(char[] ch, int sec) {
			super();
			this.ch = ch;
			this.sec = sec;
		}

		@Override
		public int compareTo(Insect arg0) {
			return this.sec - arg0.sec;
		}
		
		@Override
		public int hashCode(){
			int hash = 0;
			
			for(int i = 0; i < ch.length; i++){
				if(ch[i] == 'r'){
					hash += 1;
				}else if(ch[i] == 'g'){
					hash += 2;
				}else{
					hash += 3;
				}
				
				if(i != ch.length - 1){
					hash <<= 2;
				}
			}
			
			return hash;
		}
		
		@Override
		public boolean equals(Object o){
			return o instanceof Insect && o.hashCode() == this.hashCode();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			String str = sc.next();
			
			if("0".equals(str)){
				break;
			}
			
			PriorityQueue<Insect> queue = new PriorityQueue<Insect>();
			HashSet<Insect> visited = new HashSet<Insect>((int) Math.pow(3, str.length()));
			
			
			queue.add(new Insect(str.toCharArray(), 0));
			
			int min = -1;
			
			while(!queue.isEmpty()){
				Insect is = queue.poll();
				
				if(visited.contains(is)){
					//System.out.println("!!! duplicate !!! " + Arrays.toString(is.ch) + " " + is.hashCode() + " " + is.sec);
					continue;
				}
				visited.add(is);
				
				boolean flag = true;
				for(int i = 0; i < is.ch.length - 1; i++){
					if(is.ch[i] != is.ch[i+1]){
						flag = false;
						break;
					}
				}
				
				if(flag){
					min = is.sec;
					break;
				}
				
				for(int i = 0; i < is.ch.length - 1; i++){
					if(is.ch[i] != is.ch[i+1]){
						char[] tmp = new char[is.ch.length];
						System.arraycopy(is.ch, 0, tmp, 0, is.ch.length);						
						
						if(is.ch[i] == 'r'){
							if(is.ch[i+1] == 'g' ){
								tmp[i] = tmp[i+1] = 'b';
							}else if(is.ch[i+1] == 'b' ){
								tmp[i] = tmp[i+1] = 'g';
							}
						}else if(is.ch[i] == 'g'){
							if(is.ch[i+1] == 'r' ){
								tmp[i] = tmp[i+1] = 'b';
							}else if(is.ch[i+1] == 'b' ){
								tmp[i] = tmp[i+1] = 'r';
							}
						}else{
							if(is.ch[i+1] == 'r' ){
								tmp[i] = tmp[i+1] = 'g';
							}else if(is.ch[i+1] == 'g' ){
								tmp[i] = tmp[i+1] = 'r';
							}
						}
						
						Insect t = new Insect(tmp,is.sec+1);
						
						if(!visited.contains(t)){
							queue.add(t);
						}else{
							//System.out.println("!!! duplicate !!! " + Arrays.toString(is.ch) + " " + is.hashCode() + " " + is.sec);
						}
					}
				}
				
			}
			
			if(min != -1){
				System.out.println(min);
			}else{
				System.out.println("NA");
			}
			
			
		}

	}
}