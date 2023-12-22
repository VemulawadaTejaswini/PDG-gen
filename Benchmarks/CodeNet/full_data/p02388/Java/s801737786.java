import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int num;

		while(true){

			try{
				name=br.readLine();
				num=Integer.parseInt(name);
				num=(num*num*num);
				System.out.println(num);
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}