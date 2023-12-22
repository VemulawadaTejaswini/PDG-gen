import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws IOException {
		String str="";
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String[] datas;
		int[] rika=new int[4];
		int[] syakai=new int[2];
		int rikamin=100;
		int syamin=100;

		int sum=0;

		for(int i=0; i<6; i++) {
			if(i<4) {
				rika[i]=Integer.parseInt(bfr.readLine());
				if(rika[i]<rikamin) {
					rikamin=rika[i];
				}
				sum+=rika[i];
			}
			else if(i>=4) {
				syakai[i-4]=Integer.parseInt(bfr.readLine());
				if(syakai[i-4]<syamin) {
					syamin=syakai[i-4];
				}
				sum+=syakai[i-4];
			}
		}
		sum=sum-syamin-rikamin;
		System.out.println(sum);
	}
}
