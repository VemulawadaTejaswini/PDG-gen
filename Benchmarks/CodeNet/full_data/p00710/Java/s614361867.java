import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int r=sc.nextInt();
			if(n==0&&r==0) break;
			int[] card = new int[n];
			for(int i=0;i<n;++i){
				card[i]=i+1;
			}
			for(int i=0;i<r;++i){
				int p=sc.nextInt();
				int c=sc.nextInt();
				int[] copy = new int[n];
				for(int j=n-1;j>n-1-c;--j){
					copy[j]=card[n-p];
					card[n-p]=0;
					p++;
				}
				int flag=n-1;
				for(int j=n-1-c;j>0;--j){
					if(card[flag]!=0){
						copy[j]=card[flag];
					} else {
						j++;
					}
					flag--;
				}
				card=copy.clone();
			}
			System.out.println(card[n-1]);
		}
	}

}

