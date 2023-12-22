import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(" ");
		for(int i=1; i<=N; i++) {
			int x=i;
			if(i%3==0) {
				sb.append(i+" ");
			}else {
				while(x>=1){
					if(x%10==3){
						sb.append(i+" ");
						break;
					}
					x/=10;
				}
			}
		}
		
		System.out.println(sb);
	}

}

