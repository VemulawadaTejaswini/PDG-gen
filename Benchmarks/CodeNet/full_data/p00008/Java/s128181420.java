import java.io.*;

public class Main0008{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int t;
		int n=0;
		try{
			while((s=reader.readLine()) !=null){
				t=Integer.parseInt(s);
				for(int a=0;a<10;a++){
					for(int b=0;b<10;b++){
						for(int c=0;c<10;c++){
							for(int d=0;d<10;d++){
								if((a+b+c+d) == t){
										n += 1;
								}
							}
						}
					}
				}
				System.out.println(n);
				n=0;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}