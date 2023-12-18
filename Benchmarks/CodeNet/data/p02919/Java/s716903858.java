import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		int[] data = getIntArry(st);
		int ans = 0;
		for(int l=0;l<n-1;l++) {
			int max = data[l];
			int ne = data[l];
			for(int r=l+1;r<n;r++) {
				int b = data[r];
				if (max < b) {
					ne = max;
					max = b;
				} else if(ne < b){
					ne = b;
				} else if(ne == max) {
					ne = b;
				}
				ans+=ne;
			}
		}
		anser(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}

	private static int[] getIntArry(BufferedReader st) throws Exception, IOException {
		String line = st.readLine();
		String[] strData = line.split(" ");
		int[] intData = new int[strData.length];
		for (int i = 0; i < strData.length; i++) {
			intData[i] = Integer.parseInt(strData[i]);
		}
		return intData;
	}

	private static void anser(int num) {
		System.out.println(num);
	}
}