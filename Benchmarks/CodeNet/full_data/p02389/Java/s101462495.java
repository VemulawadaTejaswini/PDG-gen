import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int num;
		int compare;

		while(true){

			try{
				StringTokenizer st=new StringTokenizer(name," ");
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				compare=a*b;
				num=a+b+a+b;
				System.out.println(compare+" "+num);
				name=br.readLine();
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}