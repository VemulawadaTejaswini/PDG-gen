import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int p=sc.nextInt();
				int[] stone=new int[n+1];
				if(n+p==0) break;
				int num=p;
				while(true) {
					int end=0;
					for(int i=0; i<n; i++) {
						if(num==1 && stone[i]==p-1) {
							System.out.println(i);
							end=1;
							break;
						}
						if(num>0) {
							stone[i]++;
							num--;
						}
						else if(num==0 && stone[i]>0) {
							num+=stone[i];
							stone[i]=0;
						}
					}
					if(end==1) break;
				}

			}
			
		}
	}
}
