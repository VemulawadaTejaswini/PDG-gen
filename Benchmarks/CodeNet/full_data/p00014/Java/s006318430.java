import java.io.*;

class Integral
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		int z = 0;


	while(z<=20){

		int integral = 0;
		int  j=1;

		String str = br.readLine();
		int d = Integer.parseInt(str);

		int num = 600 / d;

		for(int i=0; i<num-1; i++){

			integral = integral + (j*d)*(j*d)*d;
			j++;

		}


		System.out.println(integral);

		z++;
	}



	}

}