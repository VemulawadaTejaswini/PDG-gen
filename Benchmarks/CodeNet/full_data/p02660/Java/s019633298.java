import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(reader.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		long res=  0;
		for(int i = 2;i*i<=N;i++){
			if(N%i==0){
				int toadd = 0;
				while(N%i==0){
					N/=i;
					toadd++;
				}
				res += effective(toadd);
			}
		}
		if(N!=1) res++;
		System.out.println(res);
	}
	private static int effective(int a){
		if(a==1) return 1;
		else{
			int res= 0;
			int sum = 0;
			int i = 1;
			while(true){
				if(a-i>i){
					res++;
					a-=i;
					i++;
				}
				else{
					if(a==0) return res;
					else return res+1;
				}

			}
		}
	}
}
