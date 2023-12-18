import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] an = new int[n];
		int checkSum = 0;
		int same = 0;
		int sameNum = 0;

		for( int i=0; i<n; i++ ){
			an[i] = sc.nextInt();
			same = 0;
			for( int j=0; j<i; j++ ){
				if( an[i]==an[j] ){
					checkSum -= an[i];
					same = 1;
					sameNum++;
					break;
				}
			}
			if( same == 0 ){checkSum += an[i];}
		}

		//記憶正誤の判定
		for( int i=0; i<n; i++ ){
			for( int j=i+1; j<n; j++ ){
				if( an[i] == 0 && an[j] == 0 ){
					System.out.println(0);
					return;
				}
			}
		}
		if(checkSum != 0){
			System.out.println(0);
			return;
		}


		int ans=1;
		for( int i=0; i<sameNum; i++ ){
			ans *= 2;
		}
		System.out.println(ans%1000000007);
                return;
	}
}