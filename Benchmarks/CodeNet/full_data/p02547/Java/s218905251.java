import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] d1=new int[n-1];
		int[] d2=new int[n-1];
		for(int i=0;i<n;i++) {
			d1[i]=sc.nextInt();
			d2[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-2;i++) {
				if(d1[i]==d2[i]&&d1[i+1]==d2[i+1]&&d1[i+2]==d2[i+2]) {
					System.out.println("Yes");
					break;
					}
				else if(d1[n-3]==d2[n-3]&&d1[n-2]==d2[n-2]&&d1[n-1]==d2[n-1]) {
					System.out.println("No");
				}
		}
		sc.close();
	}
	}