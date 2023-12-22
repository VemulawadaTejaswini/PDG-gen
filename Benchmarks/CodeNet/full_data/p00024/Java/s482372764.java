import java.io.*;

class Main{
    public static int ans(double v){
	double t=v/9.8;
	double y=4.9*Math.pow(t,2);
	return (int)(y/5.0)+2;
    }
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader (System.in));
	String buf;

	while((buf=br.readLine())!=null){
	    System.out.println(ans(Double.parseDouble(buf)));
	}
    }
}