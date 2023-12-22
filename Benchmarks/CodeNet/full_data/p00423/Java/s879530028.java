import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int ah,bh;
		int as=0,bs=0;
		String[] s;
		try{
			for(int i=0;i<n;i++){
				s=br.readLine().split(" ");
				ah=Integer.parseInt(s[0]);
				bh=Integer.parseInt(s[1]);
				if(ah>bh) as+=ah+bh;
				else if(ah<bh) bs+=ah+bh;
				else {as+=ah;bs+=bh;}
		}
		}catch(Exception e){
		}
		System.out.println("\n"+as+" "+bs);
	}
}