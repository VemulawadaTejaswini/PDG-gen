
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) {
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		int[] mountains=new int[10];
			try {
				String str=br.readLine();
				String[] height=str.split(" ");
				for (int i=0;i<height.length;i++){
					mountains[i]=Integer.parseInt(height[i]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		for(int h=mountains.length-1;h>0;h--){
			for(int i=h;i>0;i--){
				if(mountains[i]>mountains[i-1]){
					int tmp=mountains[i];
					mountains[i]= mountains[i-1];
					mountains[i-1]=tmp;
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(mountains[i]);
		}
	}
}