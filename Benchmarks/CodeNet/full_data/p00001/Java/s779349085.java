import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int[] mountains = new int[10];
		int[] big = new int[4];
		int cursor=0;

		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++){
			mountains[i]=Integer.valueOf(d.readLine());
		}

		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				if(big[j]<=mountains[i]){
					for(int k=2;k>j;k--){
						big[k]=big[k-1];
					}
					big[j]=mountains[i];
					mountains[i]=0;
				}
			}
		}


		for(int i=0;i<3;i++){
			System.out.println(big[i]);
		}
	}

}