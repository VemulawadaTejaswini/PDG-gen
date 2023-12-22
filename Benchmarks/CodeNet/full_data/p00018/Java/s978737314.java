import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int n = 5;
		String c = br.readLine();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
		if(c.indexOf(" ") !=  -1){
		String str = c.substring(0, c.indexOf(" "));
		arr[i] = Integer.parseInt(str);
		c = c.substring(c.indexOf(" ") + 1);
		}
		else{
			arr[i] = Integer.parseInt(c);
		}
		}
		arr = sort(arr, 5);
		for(int i = 0; i < 5;i++){
			System.out.print(arr[i]);
			if(i != 4)
				System.out.print(" ");
		}
		System.out.println();
		
	}
	static int[] sort(int[] arr, int len){
		for(int i = 0; i < len;i++){
			int max = arr[i];
			int index = i;
			for(int j = i; j < len; j++){
				if(max < arr[j]){
					max = arr[j];
					index  = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = max;
		}
		return arr;
	}

}