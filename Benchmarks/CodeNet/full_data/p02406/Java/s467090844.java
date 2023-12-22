import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		int n = new Scanner(System.in).nextInt();
		int i=1;
		do{
			int x=i;
			if(x%3==0){
				System.out.print(" "+i);
			}else if(check3(i, Integer.toString(i).length())){
				System.out.print(" "+i);
			}
		}while(++i<=n);
		System.out.println("");
	}
	
	private static boolean check3(int n, int k){
		boolean res=false;
		int t=(int)Math.pow(10, k-1);
		if(n/t==3){
			res=true;
		}else if(k>1){
			res=check3(n%t, k-1);
		}
		return res;
	}
}