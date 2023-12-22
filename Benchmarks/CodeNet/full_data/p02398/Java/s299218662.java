import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt(),b=cin.nextInt(),c=cin.nextInt(),res=0;
		for(int i=a;i<=b;i++){
			if(c%i==0)res++;
		}
		System.out.println(res);
	}

}

