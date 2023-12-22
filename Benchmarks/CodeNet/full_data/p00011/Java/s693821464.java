import java.util.Scanner;
import java.io.*;
public class Main{
	private static void change(int data[],int f,int s){
		int temp = data[f-1];
		data[f-1] = data[s-1];
		data[s-1] = temp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		scan.useDelimiter(",");
		int[] data = new int[w];
		for(int i=0;i<w;i++){
			data[i]=i+1;
		}
		int first =0;
		int second =0;
		for(int i=0;i<n;i++){
			String str=br.readLine();
			String[] plot = str.split(",");
			change(data,Integer.parseInt(plot[0]),Integer.parseInt(plot[1]));
		}
		for(int i=0;i<=n;i++)
			System.out.println(data[i]);
	}

}