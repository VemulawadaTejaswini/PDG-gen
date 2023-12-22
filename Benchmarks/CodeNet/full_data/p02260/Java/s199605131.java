import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	private static int selection(int a[]){
		int count=0;
		int mini=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			mini=i;
			for(int j = i+1;j<a.length;j++){
				if(a[j]<a[mini]){
					mini=j;			
				}
			}
			if(mini!=i){
				int temp=a[i];
				a[i]=a[mini];
				a[mini]=temp;
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strdata = new String[n];
		String str = br.readLine();
		strdata = str.split(" ");
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++)
			data[i] = Integer.parseInt(strdata[i]);
		int count = selection(data);
		for(int i = 0 ; i < n-1; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println(data[n-1]);
		System.out.println(count);
	}
}