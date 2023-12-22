import java.util.*;

public class Main{
	public static void main(String[] args){
		Deque<Integer> list = new ArrayDeque<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int cmd = scan.nextInt();
			switch(cmd){
				case 0:
					if(scan.nextInt() == 0) list.addFirst(scan.nextInt());
					else list.addLast(scan.nextInt());
					break;
				case 1:
					int p = scan.nextInt();
					int j = 0;
					for(Integer num : list){
						if(j == p) System.out.println(num);
						j++;
					}
					break;
				case 2:
					if(scan.nextInt() == 0) list.removeFirst();
					else list.removeLast();
					break;
			}
		}
	}
}

