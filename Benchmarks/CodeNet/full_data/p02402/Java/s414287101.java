import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		int min=0, max=0, sum=0;
		for(int i=0; i<n; i++){
			a = sc.nextInt();
			if(i==0){
				min = max = a;
			}
			if(min>a) min = a;
			if(max<a) max = a;
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}