import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		TreeSet<Integer>shrine = new TreeSet<Integer>();
		TreeSet<Integer>temple = new TreeSet<Integer>();
		int q[] = new int[c];
		for(int i = 0; i < a; i ++) {
			shrine.add(sc.nextInt());
		}for(int i = 0; i < b; i ++) {
			temple.add(sc.nextInt());
		}for(int i = 0; i < c; i++) {
			int min = Integer.MAX_VALUE;
			if(shrine.floor(q[i])!=null&&temple.floor(q[i])!=null) {
				min = shrine.floor(q[i])+temple.floor(q[i]);
			}else if(shrine.ceiling(q[i])!=null&&temple.ceiling(q[i])!=null&&shrine.ceiling(q[i])+temple.ceiling(q[i])<min) {
				min = shrine.ceiling(q[i])+temple.ceiling(q[i]);
			}else if(shrine.floor(q[i])!=null&&temple.ceiling(q[i])!=null&&2*shrine.floor(q[i])+temple.ceiling(q[i])<min) {
				min = 2*shrine.floor(q[i])+temple.ceiling(q[i]);
			}else if(shrine.ceiling(q[i])!=null&&temple.floor(q[i])!=null&&2*shrine.ceiling(q[i])+temple.floor(q[i])<min) {
				min = 2*shrine.ceiling(q[i])+temple.floor(q[i]);
			}else if(shrine.floor(q[i])!=null&&temple.ceiling(q[i])!=null&&shrine.floor(q[i])+2*temple.ceiling(q[i])<min) {
				min = shrine.floor(q[i])+2*temple.ceiling(q[i]);
			}else if(shrine.ceiling(q[i])!=null&&temple.floor(q[i])!=null&&shrine.ceiling(q[i])+2*temple.floor(q[i])<min) {
				min = shrine.ceiling(q[i])+2*temple.floor(q[i]);
			}System.out.println(min);
		}
	}

}
