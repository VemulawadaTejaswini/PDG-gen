import java.util.*;
public class Main {
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//いろいろ 
		int[] x=new int[N];
	//計算
		int i=0;
		while( i < N && i<10 ){
			x[i]=i;
			i++;
		}
		tmp=1;
		while( i < N ){
			tmp=tmp*10+9;
			x[i]=tmp;
			i++;
		}
	//出力
		System.out.println(a);
	}
}