import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int wholeLcm = 1;
		int[] denominator = new int[n];
		int totalMolecule = 0;
		for(int i=0;i<n;i++){
			denominator[i] = sc.nextInt();
			wholeLcm = lcm(wholeLcm,denominator[i]);
		}
		
		for(int i=0;i<n;i++){
			totalMolecule += wholeLcm/denominator[i];
		}
		
        System.out.println((double)wholeLcm/totalMolecule);
	}
      
	static int lcm (int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}
}
