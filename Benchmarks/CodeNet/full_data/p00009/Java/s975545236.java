import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int N,cnt=0;
		boolean[] a = new boolean[1000000];
		for(int i=0;i<1000000;i++){
			a[i]=true;
		}
		a[0]=false;
		a[1]=false;
		for(int i=2;i<500000;i++){
			a[i*2]=false;
		}
		
		while(str != null){
			N=Integer.parseInt(str);
			for(int i=3;i<=Math.sqrt(N);i++){
				if(!checkSosu(i)){
					a[i]=false;
					for(int j=2;i*j<1000000;j++){
						a[i*j]=false;
					}
				}
			}
			for(int k=0;k<=N;k++){
				if(a[k]==true){
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt=0;
			str=br.readLine();
		}

	}
	
	public static boolean checkSosu(int x){
		if(x==0 || x==1){
			return false;
		}else if(x>=2){
			for(int i=2;i<=Math.sqrt(x);i++){
				if(x%i==0){
					return false;
				}
			}
			return true;
		}else{	//x<0?????¨???
			return false;
		}
	}
}