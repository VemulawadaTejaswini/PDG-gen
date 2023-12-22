import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		int compare;

		while(true){

			try{
				compare=Integer.parseInt(br.readLine());
				System.out.println(compare/3600 +":"+ (compare%3600)/60+":"+compare%60);
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}