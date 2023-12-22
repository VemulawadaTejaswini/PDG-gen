import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> listN = new LinkedList<String>();
		LinkedList<String> listFN = new LinkedList<String>();
		LinkedList<Integer> listT = new LinkedList<Integer>();
		LinkedList<Integer> listFT = new LinkedList<Integer>();
		StringTokenizer st2 = new StringTokenizer("");
		
		int n = 0;
		int q = 0;
		int result = 0;
		int finT = 0;
		String str ="";
		
		n = Integer.parseInt(as.next());
		q = Integer.parseInt(as.next());
		//System.out.println(n);
		//System.out.println(q);
		//str = br.readLine();
		//System.out.println(str);
		//st2 = new StringTokenizer(str);
		for(int i=0;i<n;i++){
			
			
			//listN.add(st2.nextToken());
			//listT.add(Integer.parseInt(st2.nextToken()));
			
			
			listN.add(as.next());
			listT.add(Integer.parseInt(as.next()));
		}
		
		
		while(listT.size() != 0){
			
			if((result = listT.peek() - q) <= 0){
				
				//long start = System.nanoTime();

				
				listFN.add(listN.removeFirst());
				listFT.add(finT += listT.removeFirst());
				
				
				//long end = System.nanoTime();
				//System.out.println((end - start) / 1000000f + "ms"+":if");
				
			}
			else{
				
				//long start = System.currentTimeMillis();
				
				finT += q;
				listT.set(0, result);
				listT.offer(listT.poll());
				listN.offer(listN.poll());
				
				//long end = System.currentTimeMillis();
				//System.out.println((end - start) / 1000000f + "ms"+":else");
				
			}
			
		}
		
		for(int i=0;i<n;i++){
			
			sb.append(listFN.get(i)).append(" ").append(listFT.get(i));
			System.out.println(sb.toString());
			sb.setLength(0);
			
		}
		long end = System.nanoTime();
		//System.out.println((end - start) / 1000000f + "ms"+":subete");

	}

}