import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int[] mountains = new int[10];
		int[] big = new int[3];
		int cursor;

		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++){
			mountains[i]=Integer.valueOf(d.readLine());
		}


		big[0]=mountains[0];
		for(cursor=0;cursor<3;cursor++){
			for(int i=0;i<10;i++){
				if(big[cursor]<=mountains[i]){
					if(cursor<2)big[cursor+1]=big[cursor];
					big[cursor]=mountains[i];
					mountains[i]=0;
				}
			}
		}

		for(int i=0;i<3;i++){
			System.out.println(big[i]);
		}
	}
}