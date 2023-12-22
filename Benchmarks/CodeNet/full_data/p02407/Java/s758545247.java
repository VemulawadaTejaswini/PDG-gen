import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] array;
		int n=0;
		
		while((str=br.readLine())!=null){
			if(n==0){
				n=Integer.parseInt(str);
				continue;
			}
			array=str.split(" ");
			for(int i=0;i<n;i++){
				if(i==n-1){
					System.out.print(array[0]);
					break;
				}
				System.out.print(array[n-(i+1)] +" ");
			}
			break;
		}
		br.close();
	}
}