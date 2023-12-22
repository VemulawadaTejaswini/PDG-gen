import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] m = new int[100], f = new int[100], r = new int[100];
		int sum, cnt = 0;
		
		while(true){
			m[cnt] = sc.nextInt();
			f[cnt] = sc.nextInt();
			r[cnt] = sc.nextInt();
			
			if(m[cnt] + f[cnt] + r[cnt] == -3){
				break;
			}
			
			cnt ++;
		}
		
		for(int i = 0; i < cnt; i++){
			if(m[i] < 0 || f[i] < 0){
				System.out.println("F");
			}
			else{
				sum = m[i] + f[i];
				
				if(sum >= 80){
					System.out.println("A");
				}
				else if(65 <= sum && sum < 80){
					System.out.println("B");
				}
				else if(50 <= sum && sum < 65){
					System.out.println("C");
				}
				else if(30 <= sum && sum < 50){
					if(r[i] >= 50){
						System.out.println("C");
					}
					else{
						System.out.println("D");
					}
				}
				else{
					System.out.println("F");
				}
			}
		}
	}
}