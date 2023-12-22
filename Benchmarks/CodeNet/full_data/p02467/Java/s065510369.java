import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int s=a;
		int count=0;
		int sosu[]=new int[10000];
		for(int i=2;i<=s;i++){
			if(s%i==0){
				sosu[count]=i;
				s/=i;
				count++;
				i=1;
			}
		}
		System.out.print(a+":");
		for(int j=0;j<=a;j++){
			if(sosu[j]!=0){
				System.out.printf(" %d",sosu[j] );
			}
		}
		System.out.println();
	}

}