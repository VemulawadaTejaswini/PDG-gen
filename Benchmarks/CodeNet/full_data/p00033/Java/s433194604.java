import java.io.*;

public class Main {

	static boolean f = false;
	static int[] left = new int[10];
	static int[] right = new int[10];
	static int[] arr = new int[10];
	static int left_c = 0, right_c = 0;
	
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();
		int kaisuu = Integer.parseInt(str);

		for(int j = 0; j < kaisuu;j++){
			int n = 10;
			String c = br.readLine();

			for(int i = 0; i < n; i++){
				if(c.indexOf(" ") !=  -1){
					String prestr = c.substring(0, c.indexOf(" "));
					arr[i] = Integer.parseInt(prestr);
					c = c.substring(c.indexOf(" ") + 1);
				}
				else{
					arr[i] = Integer.parseInt(c);
				}
				//System.out.println(junban[i]);
			}
			back(0);//, 0);
			if(f)
				System.out.println("YES");
			else
				System.out.println("NO");
			reset();
		}
		
		
	}
	static private void back(int i){
		if(i == 10){
			f = true;
			return;
		}
		if(left_c == 0 || left[left_c-1] < arr[i]){
			left[left_c++] = arr[i];
			back(i+1);//, k+1);
		}
		else if(right_c == 0 || right[right_c-1] < arr[i]){
			right[right_c++] = arr[i];
			back(i+1);//, k+1);
		}
		else {
			return;
		}
	}
	
	static void reset(){
		for(int i = 0; i < 10; i++){
			left[i] = 0;
			right[i] = 0;
			arr[i] = 0;
		}
		f = false;
		left_c = 0; right_c = 0;
	}
}