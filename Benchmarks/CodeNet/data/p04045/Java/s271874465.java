import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] d = new int[k];
	for(int i = 0; i < k; i++) {
		d[i] = sc.nextInt();
	}
	boolean flag = true;
	while(flag == true) {
		flag = false;
		for(int i = 0; i < k; i++) {
			if(String.valueOf(n).contains(String.valueOf(d[i]))) {
				flag = true;
				n++;
				break;
			}
		}
		if(flag == false) {
			System.out.println(n);
		}
	}
}
}