import java.util.*;
public class Main{
	static int EightDivsJudge(int k){
		int num = 0;
		for(int i=1; i<=((k+1)/2)*2 - 1; i+=2){
			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0)count++;
			}
			if(count==8)num++;
		}
		return num;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(EightDivsJudge(n));
	}
}