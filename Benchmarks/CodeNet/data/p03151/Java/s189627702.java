import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]ai=new int[n];
		int[]bi=new int[n];
		for(int i=0;i<n;i++) {
			ai[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			bi[i]=sc.nextInt();
		}
		int minusNums=0;
		int minusNumsLength=0;
		int[]plusNums=new int[n];
		for(int i=0;i<n;i++) {
			if(ai[i]-bi[i]<0) {
				minusNums+=ai[i]-bi[i];
				minusNumsLength++;
			}else {
				plusNums[i]=ai[i]-bi[i];
			}
		}
		if(minusNums==0) {
			System.out.println("0");
			return;
		}
		Arrays.sort(plusNums);
		for(int i=0;i<plusNums.length;i++) {
			minusNums+=plusNums[plusNums.length-i-1];
			if(minusNums>=0) {
				System.out.println(minusNumsLength+i+1);
				return;
			
			}
		}
		System.out.println("-1");
		
	}
}

