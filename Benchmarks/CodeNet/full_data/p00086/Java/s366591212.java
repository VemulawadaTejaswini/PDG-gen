import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int couner[]=new int[101];
		int a,b;
		boolean f;

		
		while(sc.hasNext()){
			Arrays.fill(couner, 0);
			f=true;
			while(true){
				a=sc.nextInt();
				b=sc.nextInt();
				if(a+b==0){
					break;
				}
				couner[a]++;
				couner[b]++;
			}
			if(couner[1]%2==0) f=false;
			if(couner[2]%2==0) f=false;
			for(int i=3;i<101;i++){
				if(couner[i]%2!=0){
					f=false;
					break;
				}
			}
			if(f){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
		}
	}
}