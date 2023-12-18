import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		int i;
		for(i=0; i<n; i++)
			array[i] = Integer.parseInt(br.readLine());
		
		int[] list = new int[0];
		int j;
		int[] tmp;
		for(i=n-1; 0<=i; i--){
			for(j=0; j<list.length; j++){
				if( array[i] < list[j] ){
					list[j] = array[i];
					Arrays.sort(list);
					break;
				}
			}
			if( j == list.length ){
				tmp = new int[list.length+1];
				System.arraycopy(list, 0, tmp, 0, list.length);
				tmp[list.length] = array[i];
				Arrays.sort(tmp);
				list = tmp;
			}
		}
		
		System.out.println(list.length);
	}
}
