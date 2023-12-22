import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	private static void bubbleUP(char a[]){
		int count=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = a.length-1;j>i;j--){
				if(a[j]>a[j-1]){
					char temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					count++;
				}
			}
		}
	}
	private static void bubble(char a[]){
		int count=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					char temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					count++;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		char[] data = a.toCharArray();
		bubble(data);
		for(int i = data.length-1; i!=0 ; i--){
			System.out.print(data[i]);
		}
		System.out.println("");
		for(int i = 0 ; i < 8 ; i ++){
			System.out.print(data[i]);
		}
		System.out.println("");

	}
}