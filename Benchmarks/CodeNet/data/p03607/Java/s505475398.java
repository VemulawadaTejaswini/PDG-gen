import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a;
		int[] b;
		int[] c;
        a = new int[100001];
		b = new int[100001];
		c = new int[100001];
		for(int s = 0; s < 100000; s++){
			a[s] = 0;
			b[s] = 0;
			c[s] = 0;
		}
        int tmp;
        int count = 0;
        for(int i = 0; i < num; i++){
            tmp = sc.nextInt();
			if(tmp < 100000){
				a[tmp] = (a[tmp] + 1) % 2; 
			}else{
				int top,under;
				top = tmp /100000;
				under = tmp %100000;
				b[top] = 1;
				if(b[top] == c[under]){
					c[under] = (c[under] + 1) % 2; 
				}
			}
        }
		for(int j = 0; j < 100000; j++){
			if(a[j] == 1) count++;
			if(c[j] == 1) count++;
		}
        System.out.print(count);
	}
}