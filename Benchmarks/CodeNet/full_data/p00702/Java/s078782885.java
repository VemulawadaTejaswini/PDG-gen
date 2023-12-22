import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static String[] combi={"ld","mb","mp","nc","nd","ng","nt","nw","ps","qu","cw","ts"};
	static int[][] table;
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		table=new int[38][38];
		while(N--!=0){
			String[] s=br.readLine().split(" ");
			for(int i = 0;i<s.length;i++){
				s[i]=s[i]+"   ";
				int before=-1;
				int now=-1;
				for(int j = 0;j<s[i].length();j++){
					if(s[i].charAt(j)==' '){
						break;
					}
					boolean f = false;
					for(int k = 0;k<12;k++){
						if(s[i].substring(j,j+2).equals(combi[k])){
							f=true;
							now=26+k;
							j++;
							break;
						}
					}
					if(!f){
						now=s[i].charAt(j)-'a';
					}
					if(before!=-1){
						table[before][now]++;
//						System.out.println(before+" "+now);
					}
					before=now;
				}
			}
		}
		for(int i = 0;i<38;i++){
			int max=0;
			int maxIdx=0;
			for(int j = 0;j<38;j++){
				if(max<table[i][j]){
					max=table[i][j];
					maxIdx=j;
				}
			}
			if(max!=0){
				System.out.println(out(i)+" "+out(maxIdx)+" "+max);
			}
			else{
				System.out.println(out(i)+" a "+max);
			}
		}
	}
	static String out(int a){
		if(a<26){
			char re = (char)(a+'a');
			//System.out.println("aaaaaaa"+a);
			String rere=String.valueOf(re);
			return rere;
		}
		else{
			a-=26;
			return combi[a];
		}
	}
}