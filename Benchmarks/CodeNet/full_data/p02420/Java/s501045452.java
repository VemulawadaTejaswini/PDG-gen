import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		while(true){
		String x=br.readLine();
		if(x.equals("-"))break;
		int y=Integer.parseInt(br.readLine());
		int z=0;
		String str;
		StringBuilder stb=new StringBuilder(x);
		
		for(int i=0;i<y;i++){
			z=Integer.parseInt(br.readLine());
			stb=stb.append(stb.substring(0,z));
			stb=stb.delete(0, z);
		}System.out.println(stb);
		
		}
		}
		
		}