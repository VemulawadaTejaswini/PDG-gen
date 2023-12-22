
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;;
 class Test23 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hight = new int[10];
		for(int i=0;i<10;i++){
			hight[i]=Integer.parseInt(br.readLine());
		}Arrays.sort(hight);
		for(int j=hight.length-1;j>hight.length-4;j--)		System.out.println(hight[j]);
	}
}