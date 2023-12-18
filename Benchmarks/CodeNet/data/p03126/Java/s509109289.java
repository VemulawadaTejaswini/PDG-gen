import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int kinds = sc.nextInt();
		int like[] = new int[kinds];
		for(int i = 0; i < kinds; i ++) {
			like[i] = 0;
		}
		for(int i = 0; i < num; i ++) {
			int likeNum = sc.nextInt();
			for(int j = 0; j < likeNum; j ++) {
				like[sc.nextInt() - 1] ++;
			}
		}
		int count = 0;
		for(int i = 0; i < kinds; i ++) {
			if(like[i] == num) {
				count ++;
			}
		}
		System.out.println(count);
	}
}