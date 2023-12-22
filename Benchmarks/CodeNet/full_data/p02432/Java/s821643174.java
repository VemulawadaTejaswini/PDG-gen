import java.util.ArrayDeque;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		//Iterator<Integer> it = deque.iterator();
		long[] flist = new long[4000000];
		int Findex = 2000000;//indexはじめ
		int Lindex = Findex+1;//indexおわり
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			int q = sc.nextInt();
			
			if(q == 0){
				int d = sc.nextInt();
				int x = sc.nextInt();
				
				if(d == 0){
					//deque.addFirst(x);
					flist[Findex] = x;
					Findex--;
				}else{
					//deque.addLast(x);
					flist[Lindex] = x;
					Lindex++;
				}
			}else if(q == 1){
				int d = sc.nextInt();
				
				//Iterator<Integer> it = deque.iterator();
				//int num = it.next();
				//Object[] list = new Object[deque.size()];
				//int a = deque.iterator().next();
				
				//for(int j=0;j<d;j++){
					//deque.iterator();
					//num = it.next();
				//}
				
				//list = deque.toArray();
				
				System.out.println(flist[Findex + d+1]);
				
			}else{
				int d = sc.nextInt();
				
				if(d == 0){
					//deque.removeFirst();
					flist[Findex] = 0;
					Findex++;
				}else{
					//deque.removeLast();
					flist[Lindex] = 0;
					Lindex--;
				}
			}
		}

	}

}

