import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int count = 0;
		int table[] = new int[55555];
		for(int i = 2; i<Math.sqrt(55555); i++){
			if(table[i]==0){
				System.out.print(i);
				System.out.print(" ");
				count++;
			}
			if(count==num){
				break;
			}
			int tmp = i;
			while((tmp+=i)<55555){
				table[tmp]=1;
			}
		}
	}

}
