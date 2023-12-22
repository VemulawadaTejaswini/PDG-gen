
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), T = sc.nextInt(), H = sc.nextInt(), l = sc.nextInt();
		int t[] = new int[n], h[] = new int[n];
		int min = 7754666, m = 0;
		int a;
		int money = 0;
		for(int i=0;i<n;i++){
			t[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if(min > t[i]){
				min = t[i];
				m = i;
			}
		}

		a = n*(min-1)+m+1;

		int i=0; flag: while(true){
			if(t[i] > 0){
				T++;
				t[i]--;
				money += 10;
			}else if(h[i] > 0){
				H++;
				h[i]--;
				money += 100;
			}else{
				break flag;
			}
			
			if(T > l)
				break;
			
			if(money >= 90){
				if(T*10 < money)
					break;
				else{
					T -= money/10;
					t[i] += money/10;
					money = 0;
				}
			}
			
			i = (i+1)%n;
		}
		
		System.out.println(i+1);

//		while(true){
//			for(int i=0;i<n;i++){
//				if(t[i] == 0 && h[i] == 0){
//					System.out.println(i+1);
//					return;
//				}
//				else if(t[i] != 0){
//					if(T == l){
//						System.out.println(i+1);
//						return;
//					}else{
//						T++;
//						t[i]--;
//						money += 10;
//						if(money >= 90){
//							if(T >= 9){
//								T -= 9;
//								t[i] += 9;
//							}
//							else{
//								t[i] += T;
//								h[i] += 9-T;
//								H -= 9-T;
//								T = 0;
//
//							}
//							money = 0;
//						}
//					}
//				}else{
//					H++;
//					h[i]--;
//					money += 100;
//					if(T >= money/10-9){
//						T -= money/10-9;
//						t[i] += money/10-9;
//						money = 0;
//					}else{
//						System.out.println(i+1);
//						return;
//					}
//				}
//			}
//		}
	}
}