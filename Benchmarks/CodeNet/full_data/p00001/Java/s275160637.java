import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			int n1=0,n2=0,n3=0;
			for(int i = 0;i<10;++i){
				String line = reader.readLine();
				int n = Integer.parseInt(line);
				if(n1 <= n){
					n3 = n2;
					n2 = n1;
					n1 = n;
				}
				else if(n2<=n){
					n3=n2;
					n2=n;
				}
				else if(n3<=n){
					n3=n;
				}
			}
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}catch (IOException e){
			System.out.println(e);
		}
	}
}