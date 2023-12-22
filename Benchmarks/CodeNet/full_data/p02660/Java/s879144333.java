import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		int ans = 0;
		boolean mange = true;
		boolean sosu = true;
		ArrayList<Integer> oppai = new ArrayList<Integer>();
		while(mange) {
			mange = false;
			
			for(int i=2;i<=n;i++) {
				if(n%i == 0) {
					if(!oppai.contains(i)) {
						oppai.add(i);
						ans += 1;
						n = n/i;
						mange = true;
						break;
					}
				}
			}
		}
		
		System.out.println(ans);
	}	
	
	//�ŏ�����
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
	//����ւ�
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}