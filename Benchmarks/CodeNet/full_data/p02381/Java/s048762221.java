

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int i;
		String n;
		double avg,a,sum1,sum2;
		//double[] x = new double[1000 + 1];

		while(true){
			sum1=0;
			sum2=0;
			a=0;
			n=br.readLine();
			if(n.equals("0"))break;
			int num=Integer.parseInt(n);

			String c=br.readLine();
			String b[]=c.split(" ");
			double d=0,sum=0;
			double e[]=new double[num];

			for(i=0;i<num;i++){

				e[i] = Double.parseDouble( b[i] );

				sum1+=e[i];
			}
			avg=sum1/num;
			for(i=0;i<num;i++){

				sum2+= (Math.pow((e[i]-avg),2)/num);
			}
			a=Math.sqrt(sum2);
			System.out.printf(a + "\n" );
		}

	}
}