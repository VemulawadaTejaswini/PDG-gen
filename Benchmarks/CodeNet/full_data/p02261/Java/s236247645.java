import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	int N = Integer.parseInt(br.readLine());	
	String[] in = br.readLine().split(" ");
	cards[] cds_b = new cards[N];
	cards[] cds_s = new cards[N];
	for(int i = 0; i<N;i++){
		cds_b[i] = new cards(in[i]);
		cds_s[i] = new cards(in[i]);
	}
	
	cards tmp;
	for(int i = 0; i<cds_b.length;i++){
		for(int j=cds_b.length-1;j>i;j--){
			if(cds_b[j].num < cds_b[j-1].num){
				tmp = cds_b[j-1];
				cds_b[j-1] = cds_b[j];
				cds_b[j] = tmp;
			}
		}
	}
	
	for(int i=0; i<N;i++){
		if(i>0)
			System.out.print(" ");
		System.out.print(cds_b[i].tp);
	}
	System.out.print("\n");
	System.out.println("Stable");

	int mini;

	for(int i = 0; i<N; i++){
		mini=i;
		for(int j = i;j<N;++j){
			if(cds_s[mini].num> cds_s[j].num){
				mini=j;
			}
		}
		if(i != mini){
			tmp=cds_s[i];
			cds_s[i]=cds_s[mini];
			cds_s[mini]=tmp;
		}
	}
	
	boolean flg=true;
	for(int i=0;i<N;i++){
		if(cds_b[i].tp !=cds_s[i].tp)
			flg=false;
	}
	
	for(int i=0; i<N;i++){
		if(i>0)
			System.out.print(" ");
		System.out.print(cds_s[i].tp);
	}
	System.out.print("\n");
	if(flg==true)
		System.out.println("Stable");
	else
		System.out.println("Not stable");
		

	}
	


}

class cards{
	String mark;
	int num;
	String tp;
	cards(String in){
		this.tp=in;
		this.mark = in.substring(0,1);
		this.num = Integer.parseInt(in.substring(1,2));
	}
}