import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i=0,Max,Min;
		int num[]=new int[10000];
		for(i=0;i<a;i++){
			num[i]=reader.nextInt();
		}
		if(a==1){
			System.out.println(num[0]+" "+num[0]+" "+num[0]);
		}else{
			int Sum=num[0]+num[1];
			if(num[0]>num[1]){
				Max=num[0];
				Min=num[1];
			}else{
				Max=num[1];
				Min=num[0];
			};
			for(i=2;i<a;i++){
				if(num[i]>Max){
					Max=num[i];
				}else if(num[i]<=Min){
					Min=num[i];
				}
				Sum+=num[i];
			}
			System.out.println(Min+" "+Max+" "+Sum);
		}
	}
}