import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		int K=scan.nextInt();
		long count=0;
		char c[]=S.toCharArray();
		int l=S.length();
		for(int k=1;k<l;k++){
			if(c[k]==c[k-1]){
				c[k]++;
				count++;
			}
		}
		if(c[0]==c[l-1]){
			count++;
			count*=K;
			count--;
		}
		else{
			count*=K;
		}
		System.out.print(count);
	}
	
	
}
