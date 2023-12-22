import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n;
		int a,b,c,d;
		int count = 0;
		
		while(str!=null){
			n=Integer.parseInt(str);
			for(a=0;a<=9;a++){
				for(b=0;b<=9;b++){
					for(c=0;c<=9;c++){
						for(d=0;d<=9;d++){
							if(a+b+c+d==n){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
			count=0;
			str=br.readLine();
		}
	}

}