import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		int[] data = new int[n];
		String[] sdata = new String[n];
		int counter = 0;
		int sum = 0;
		for(int i = 0 ; i < n ; i ++){
			str = br.readLine().split(" ");
			sdata[i] = str[0];
			data[i] = Integer.parseInt(str[1]);
			sum+=data[i];
		}
		for(int i = 0 ; counter==sum ; i ++){
			 if(i==n){
				i=0;
			 }
	         if(data[i]==0){
				continue;
			}
			else if(data[i]>q){
				counter+=q;
				data[i]-=q;
				continue;
			}
			else if(data[i]<=q){
				counter+=data[i];
				System.out.println(sdata[i]+" "+counter);
				data[i]=0;
				continue;
			}
		}
	}
}