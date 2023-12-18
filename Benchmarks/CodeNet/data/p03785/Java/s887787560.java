import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt(),c=s.nextInt(),k=s.nextInt();
		int[] t = new int[1000001];
		for(int i=0;i<n;i++) t[s.nextInt()]++;

		int result=0,bus;
		for(int i=0;i<t.length;i++) {
			if(t[i]>0) {
				result++;
				bus=0;
				for(int j=0;j<=k&&(i+j)<=100000;j++) {
					if(t[i+j]>0) {
						bus++;
						t[i+j]--;
						j--;
					}
					if(bus==c)
						break;
				}
				i--;
			}
		}
		System.out.println(result);
	}
}