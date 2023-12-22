import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scatter(System.in);

		for(int i = 1;;i++){
			int x = sc.nectInt();
			if(x!=0){
			System.out.printf("Case %d: %d\n",i,x);
			}else{
				break;
			}
		}
	}
}