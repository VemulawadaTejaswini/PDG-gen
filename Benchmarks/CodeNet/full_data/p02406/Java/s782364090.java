import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuilder stc_out = new StringBuilder();
		
		for(int i=1;i<=n;i++){
			if(check1(i)==1) stc_out.append(i+" ");
			if(check2(i)==1) stc_out.append(i+ " ");
		}
		System.out.println(stc_out);
	}	

	private static int check1(int num){
			if(num%3==0){
				return 1;
			}else {
				return 0;
			}
	}
	
	private static int check2(int num){
		if(num%10==3 && num%3!=0){
			return 1;
		}else {
			return 0;
		}
	}
}