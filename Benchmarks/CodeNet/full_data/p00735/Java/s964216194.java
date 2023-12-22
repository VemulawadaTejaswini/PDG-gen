import java.util.*;
public class Main {
	static int max = 3000001;
	static boolean[] gdosu= new boolean[max];
	static boolean[] gdsosu = new boolean[max];
	public static void main(String[] args) {
		for(int i=0;i<max;i++){
			gdosu[i]=false;
			if(i<=1)continue;
			if(i%7==1||i%7==6){
				gdosu[i]=true;
			}
		}
		for(int i=0;i<max;i++)gdsosu[i]=true;
		for(int i=0;i<max;i++){
			if(!gdosu[i]){
				gdsosu[i]=false;
				continue;//もし月曜土曜数ではなかったらやり直し
			}
			for(int s=i+i;s<max;s+=i){
				gdsosu[s]=false;
			}
		}
		Scanner in = new Scanner(System.in);
		while(true){
			int input = in.nextInt();
			if(input == 1)break;
			System.out.print(input+":");
			for(int i=0;i<=input;i++){
				if(!gdsosu[i])continue;
				if(input%i==0){
					System.out.print(" "+i);
				}
			}
			System.out.println();
		}
	}
}