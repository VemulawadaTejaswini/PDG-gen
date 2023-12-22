import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i < 10000; i++){
			if(gcm(26,i)==1){
				list.add(i);
			}
		}
		String NN =br.readLine(); 
		int N = Integer.parseInt(NN);
		while(N--!=0){
			String str = br.readLine();
			label:for(int i = 0; i < list.size(); i++){
				for(int j = 0; j < 26; j++){
					String nstr = "";
					for(int k = 0; k < str.length(); k++){
						if(Character.isLetter(str.charAt(k))){
							nstr += (char)(((list.get(i)*(str.charAt(k)-'a') + j)%26) + 'a');
						}
						else{
							nstr += " " ;
						}
					}
					if(nstr.contains("that") || nstr.contains("this")){
						System.out.println(nstr);
						break label;
					}
				}
			}
		}
	}
	static int gcm(int p, int q){
		if(p < q){
			int tmp=p;
			p=q;
			q=tmp;
		}
		if(q==0){
			return p;
		}
		else{
			return gcm(q, p%q);
		}
	}
}