import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			String[] arr;
			int a,b,c;
			int count=0;
			while((str=br.readLine())!=null){
				arr=str.split(" ");
				a=Integer.parseInt(arr[0]);
				b=Integer.parseInt(arr[1]);
				c=Integer.parseInt(arr[2]);
				for(int i=a;i<=b;i++) {
					if((c%i)==0)count++;
				}
				break;
			}
			System.out.println(count);
			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}