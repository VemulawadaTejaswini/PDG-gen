import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int n;
		int i,j,k,l,c;
		try {
			while(s!=null){
				s=r.readLine();
				n = Integer.parseInt(s);
				c=0;
				for(i=0;i<10;i++){
					for(j=0;j<10;j++){
						for(k=0;k<10;k++){
							for(l=0;l<10;l++){
								if(i+j+k+l==n)c++;
							}
						}
					}
				}
				System.out.println(c);
			}
		} catch (Exception err) {
			System.exit(0);
		}
	}
}