import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[]  ar = new int[5];
		int[] sup = new int[5];
		for(int i=0;i<5;i++){
			ar[i]=sc.nextInt();
			sup[i]=ar[i]%10;
			if(sup[i]!=0){
				sup[i]=10-sup[i];
			}
			System.out.println(ar[i]);
			System.out.println(sup[i]);
		};
		for(int j=0;j<5;j++){
			for(int k=0;k<5;k++){
				if(sup[j]<sup[k]){
					ar[j]=ar[j]+sup[j];
					break;
				};
			};
		};
		System.out.println(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]);

	}

}