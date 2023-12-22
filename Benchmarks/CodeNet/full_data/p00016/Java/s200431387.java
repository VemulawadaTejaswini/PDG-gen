import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int l,kakudo;
		int sumkakudo =0;
		double x,y,sumX,sumY;
		sumX=0;
		sumY=0;
		try{
			while((s=r.readLine()) !=null){
				t=s.split(",");
				l=Integer.parseInt(t[0]);
				kakudo=Integer.parseInt(t[1]);
				if(l==0 &&kakudo==0){break;}
				y=l*Math.sin(Math.toRadians(90-sumkakudo));
				x=l*Math.cos(Math.toRadians(90-sumkakudo));
				sumX +=x;
				sumY +=y;
				sumkakudo +=kakudo;
			}
			System.out.println((int)sumX+" "+(int)sumY);
			sumkakudo=0;
			sumX=0;
			sumY=0;
		}catch(IOException e){
			System.out.println(e);
		}
	}
}