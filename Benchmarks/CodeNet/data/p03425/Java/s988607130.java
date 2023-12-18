import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[5];
		for(int i=0;i<n;i++) {
			char[] temp = sc.next().toCharArray();
			char top = temp[0];
			if(top=='M') array[0]++;
			if(top=='A') array[1]++;
			if(top=='R') array[2]++;
			if(top=='C') array[3]++;
			if(top=='H') array[4]++;
		}
		sc.close();
		long ans=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) ans += (long)array[i]*array[j]*array[k];
			}
		}
		System.out.println(ans);
	}
}