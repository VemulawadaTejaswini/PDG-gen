import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		int i = 0;
		int kei;
		int[] Dig = new int[200];
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			kei = (a+b);
			while(kei/10 != 0){
				Dig[i] += 1;
				kei /= 10;
			}
			Dig[i] += 1;
			i++;
		}
		for(int j=0; j<=i; j++){
			System.out.println(Dig[j]);
		}
	}
}