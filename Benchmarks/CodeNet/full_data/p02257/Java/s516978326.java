import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int n=Integer.parseInt(br.readLine());
		int[] in=new int[n];
		for(int i=0;i<n;i++)in[i]=Integer.parseInt(br.readLine());
		in=sizen(in);
		System.out.println(in.length);
		




	}
	static int[] sizen(int[] h){
		StringBuilder stb=new StringBuilder();
		for(int i=0;i<h.length;i++){
			if(h[i]==1||h[i]==2)stb.append(h[i]+" ");
			if(h[i]%2==0)continue;
			for(int j=3;;j+=2){
				if(j>(h[i]+3)/3){stb.append(h[i]+" ");break;}
				if(h[i]%j==0)break;
				
			}
		}
		String[] st=stb.toString().split(" ");
		int[] sizen=new int[st.length];
		for(int i=0;i<st.length;i++)
			sizen[i]=Integer.parseInt(st[i]);
		
		
		return sizen;
	}

}