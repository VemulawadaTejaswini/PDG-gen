import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		long a[]=new long[20000];
		long nowMax=0,nowMin=0;
		long sum=0;
		for(int i=0;i<n;i++){
			if(kb.hasNextLong()){
				a[i]=kb.nextLong();
			}else{
				break;
			}

		}
		nowMax=a[0];
		nowMin=a[0];
		for(int i=0;i<n;i++){
			if(nowMax<a[i]){
				nowMax=a[i];
			}if(nowMin>a[i]){
				nowMin=a[i];
			}

			sum+=a[i];
		}

		System.out.printf("%d %d %d\n",nowMin,nowMax,sum);
	}

}