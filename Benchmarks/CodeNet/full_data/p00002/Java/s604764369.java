import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int num = 0;
		int compare = 0;
		double a=0;

		while(true){

			try{
				num=name.indexOf(" ");
				compare=(Integer.parseInt(name.substring(0,num)))+(Integer.parseInt(name.substring(num)));
				a=(double) compare;
				a=Math.log10(a);
				compare=Math.max((int)a+1,1);
				System.out.println(compare);
				name=br.readLine();
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}