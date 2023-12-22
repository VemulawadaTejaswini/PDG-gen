import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 int n = readInt(r);
		 int[] s = strAryToIntAry(r.readLine().split(" "));
		 int q = readInt(r);
		 int[] t = strAryToIntAry(r.readLine().split(" "));

		 System.out.println(serach(n,s,q,t));

	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

	public static int[] strAryToIntAry(String[] strAry){
		int arraySize = strAry.length;
		int[] intAry= new int[arraySize + 1];
		for(int i = 0 ; i < arraySize ; i++){
			intAry[i] =Integer.parseInt(strAry[i]);
		}

		return intAry;
	}

	public static int serach(int n, int[] s,int q,int[] t){

		int key;
		int sum = 0;

		for(int i = 0 ; i < q ;i++){
			key = t[i];
			s[s.length -1] = key;
			if(keySerach(key, s)) sum++;
		}
		return sum;
	}

	public static boolean keySerach(int key,int[] s){
		int i = 0;
		while(key != s[i]) i++;
		return i != s.length -1;
	}

}