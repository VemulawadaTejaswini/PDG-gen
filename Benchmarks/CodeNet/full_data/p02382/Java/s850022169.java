import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num;
		double Dxy;
		String str;
		String[] vectorA, vectorB;

		try{

			num=Integer.parseInt(reader.readLine());
			str=reader.readLine();
			vectorA=str.split(" ");
			str=reader.readLine();
			vectorB=str.split(" ");
			int[] diff=new int[num];


			for(int i=0;i<num;i++){
				diff[i]=Integer.parseInt(vectorA[i])-Integer.parseInt(vectorB[i]);
				if(diff[i]<0)diff[i]=diff[i]*-1;
			}

			Dxy=0;
			for(int i=0;i<num;i++){
				Dxy+=diff[i];
			}System.out.printf("%.8f\n", Dxy);//p=1;

			Dxy=0;
			for(int i=0;i<num;i++){
				Dxy+=(double)diff[i]*diff[i];
			}System.out.printf("%.8f\n", Math.sqrt(Dxy));//p=2;

			Dxy=0;
			for(int i=0;i<num;i++){
				Dxy+=(double)diff[i]*diff[i]*diff[i];
			}System.out.printf("%.8f\n", Math.cbrt(Dxy));//p=3;

			Dxy=0;
			for(int i=0;i<num;i++){
				if(Dxy<diff[i])Dxy=diff[i];
			}System.out.printf("%.8f\n", Dxy);//p=???


		}catch(IOException e){
			System.out.print(e);
		}
	}

}