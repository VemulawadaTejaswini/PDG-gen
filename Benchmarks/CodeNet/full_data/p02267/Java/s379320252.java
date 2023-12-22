import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//?¢???¢?´¢
		int n =  Integer.parseInt(br.readLine());
		String[] SStr = br.readLine().split(" ");
		int[] SInt = makeIntAry(n, SStr);

		//??¢?´¢
		int q =  Integer.parseInt(br.readLine());
		String[] TStr = br.readLine().split(" ");
		int[] TInt = makeIntAry(q, TStr);

		System.out.println(search(SInt, TInt));
	}

	public static int search(int[] searched,int[] search){
		int count = 0;
		for(int i = 0 ; i < search.length ; i++ ){
			searched[searched.length - 1] = search[i];
			int y = 0;
			while(searched[y] != search[i]){
				y++;
			}
			if(y != searched.length -1) count++;
		}
		return count;
	}

	public static int[] makeIntAry(int n, String[] strAry){
		int[] intAry = new int[n+1];
		int i = 0;
		while(i < n){
			intAry[i] = Integer.parseInt(strAry[i]);
			i++;
		}
		intAry[i] = 0;
		return intAry;
	}

}