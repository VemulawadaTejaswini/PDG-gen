import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[]  ar = new int[5];
		int[] sup = new int[5];
		//数字入力・10の余りを計算
		for(int i=0;i<5;i++){
			ar[i]=sc.nextInt();
			sup[i]=ar[i]%10;
			if(sup[i]!=0){
				sup[i]=10-sup[i];
			}
			System.out.println(ar[i]);
			System.out.println(sup[i]);
		};
		//余りの大小比較。一番大きい余りを持つ数はそのまま
		//他の要素は(10-余り)を足す
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