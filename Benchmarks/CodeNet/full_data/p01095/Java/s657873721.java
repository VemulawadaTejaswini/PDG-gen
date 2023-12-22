import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0&&n==0) break;
			int[] tansaku = new int[7368792];
			int i=m,count=0;
			while(count<n) {
				if(count!=0) {
					if(i<=m*2) i++;
					else i+=2;
				}
				if(tansaku[i]==0) {
					for(int j=i;j<=7368791;j+=i) if(tansaku[j]==0) tansaku[j]=1;
					count++;
				}
			}
			for(int j=m;j<7368791;++j) {
				if(tansaku[j]==0) {System.out.println(j); break;}
			}
		}
	}
}

