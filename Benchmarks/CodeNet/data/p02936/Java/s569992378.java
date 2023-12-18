import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int Q = scan.nextInt();
			int[]a = new int[N];
			int[]b = new int[N];
			int[]p = new int[N+1];
			int[]x = new int[N+1];
			int counter = 0;
		
			Vert[] ver = new Vert[N+1];
			ArrayList<ArrayList<Integer>> hen = new ArrayList<ArrayList<Integer>>();
			for(int i = 0;i<N;i++) {
				ArrayList<Integer> te = new ArrayList<Integer>();
				hen.add(te);
			}
			for(int i = 1;i<N;i++) {//ちょっと工夫1~N-1個
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				hen.get(a[i]-1).add(b[i]);
			}	
			
			for(int i = 1;i<Q+1;i++) {//1~QのNこ
				p[i] = scan.nextInt();
				x[i] = scan.nextInt();
			}
			for(int i = 1;i<=N;i++) {
				ver[i] = new Vert(i);
			}
			for(int i = 1;i<Q+1;i++) {
				ver[p[i]].xcounter +=x[i];
			}
			Deque<Vert> stack = new ArrayDeque<Vert>();
			stack.add(ver[1]);
			//timecounter++;
			/*if(ver[1].xcounter>0) {
				counter+=ver[1].xcounter;
			}*/
			
			
			int e = 0;
			
			while(!stack.isEmpty()) {
				if(stack.element().serach==false) {//現地点読み取り済みでないなら
					stack.element().serach = true;
					if(ver[stack.element().number].xcounter>0) {
						counter+=ver[stack.element().number].xcounter;
					}
					int k = stack.element().number;
					for(int i = 0;i<hen.get(k-1).size();i++) {
						stack.addFirst(ver[hen.get(k-1).get(i)]);
						e++;
						//System.out.println(k);
						//System.out.println(hen.get(k-1).get(i));
						//System.out.println(ver[hen.get(k-1).get(i)].number);
						//System.out.println(counter);
						//System.out.println(e);
						/*if(ver[hen.get(k-1).get(i)].xcounter>0) {
							counter+=ver[hen.get(k-1).get(i)].xcounter;
						}*/
						
					}
							
						
					
				}else{//もう現地点読み取り済み
					stack.element().couner = counter;
					
					if(stack.element().xcounter>0) {
						counter-=stack.element().xcounter;
					}
					
					//System.out.println(ver[stack.element().number].number+" ");
					//System.out.print(ver[stack.element().number].couner);
					//System.out.println(counter);
					//System.out.println(e);

					stack.removeFirst();
					e++;
				}
				
			}
			//System.out.println(e);
			//System.out.println(counter);
			
			for(int i = 1;i<=N;i++) {
				System.out.println(ver[i].couner);
				//System.out.println(ver[i].xcounter);
			}
			
			
			
			
		}	
	}
}

class Vert{
	boolean serach = false;
	int number=0;
	int xcounter=0;//これが０でなければx[i]を発動
	int couner = 0;
	Vert(int n){
		number= n;
	}
}


