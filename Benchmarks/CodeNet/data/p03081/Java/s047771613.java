import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int magic = sc.nextInt();
		String oppos = sc.next();
		int type[] = new int[num];
		for(int i = 0; i < num; i ++) {
			type[i] = oppos.charAt(i) - 'A';
		}
		int opponent[] = new int[magic];
		boolean isL[] = new boolean[magic];
		for(int i = 0; i < magic; i ++) {
			opponent[i] = sc.next().charAt(0) - 'A';
			isL[i] = sc.next().charAt(0) == 'L' ? true : false;
		}
		int first = 0;
		int last = num - 1;
		for(int i = magic - 1; i >= 0; i --) {
			if(opponent[i] == type[first] && isL[i]) {
				first ++;
			}else if(opponent[i] == type[last] && !isL[i]) {
				last --;
			}
		}
		System.out.println(last - first + 1);
	}
}