import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x, i, s, cnt=0;
		for(int j=0; j<N; j++){
			x = sc.nextInt();
			if(x==2){
				cnt++;
				continue;
			}
			if(x<2 || x%2==0){
				continue;
			}
			i = 3;
			s = (int)Math.sqrt(x);
			while(i<=s){
				if(x%i==0){
					break;
				}
				i += 2;
			}
			if(x%i==0){
				continue;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}