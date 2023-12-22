import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int[] v=new int[101];
				while(sc.hasNext()) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					if(a+b==0) break;
					v[a]++;
					v[b]++;
				}
				//一筆書き判定　始点終点の頂点の次数が奇数かつそれ以外の頂点の次数が偶数→できる
				if(v[1]%2==1 && v[2]%2==1) {
					boolean tf=true;
					for(int i=3; i<101; i++) {
						if(v[i]%2==1) {
							tf=false;
							break;
						}
					}
					if(! tf) System.out.println("NG");
					else System.out.println("OK");
				}
				else
				System.out.println("NG");
			}

		}
	}
}
