import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a;
        a = new int[10001];
		for(int s = 0; s < 10000; s++) a[s] = 0;
        int tmp;
        int count = 0;
        for(int i = 0; i < num; i++){
            tmp = sc.nextInt();
			while(tmp > 10000){
				tmp = tmp / 10;
			}
			a[tmp] = (a[tmp] + 1) % 2; 
        }
		for(int j = 0; j < 10000; j++){
			if(a[j] == 1) count++;
		}
        System.out.print(count);
	}
}