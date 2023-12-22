import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	BufferedReader reader;
	
	class CharComparator implements Comparator<Character>{
		private boolean descend;
		@Override
		public int compare(Character o1, Character o2) {
			// TODO Auto-generated method stub
			if(descend) return o2-o1; else return o1-o2;

		}
		
		CharComparator(boolean descend){
			this.descend=descend;
		}
		
	}
	
	int charArray2int(final Character[] s){
		int n=0;
		for(int i=0;i<s.length;++i){
			n*=10;
			n+=s[i]-'0';
		}
		return n;
	}
	void int2charArray(Character[] s, int n){
		for(int i=s.length-1;i>=0;--i){
			s[i]=(char) (n%10+'0');
			n/=10;
		}
	}
	
	int solve(String n0){
		Character N[]=new Character[4];
		for(int i=0;i<4;++i){
			N[i]=n0.charAt(i);
		}
		
		if(charArray2int(N)%1111==0) return -1;
		
		int k;
		for(k=0;charArray2int(N)!=6174;++k){
			Arrays.sort(N, new CharComparator(true));
			int L=charArray2int(N);
			Arrays.sort(N, new CharComparator(false));
			int S=charArray2int(N);
			
			int2charArray(N, L-S);
		}
		return k;
	}
	
	String ns() throws Exception{
		return reader.readLine();
	}
	
	void io(){
		reader=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String s;
			while((s=ns()).compareTo("0000")!=0){
				int ans=solve(s);
				System.out.println(ans==-1?"NA":ans);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}