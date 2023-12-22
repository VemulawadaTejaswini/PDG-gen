import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			ArrayList<ArrayList<Boolean>> field = new ArrayList<>();
			String jfen = in.next();
			if(jfen.equals("#")) break;
			field.add(new ArrayList<Boolean>());
			for(int i=0;i<jfen.length();i++){
				char trg = jfen.charAt(i);
				if(trg=='/'){
					field.add(new ArrayList<Boolean>());
				}else if(trg=='b'){
					field.get(field.size()-1).add(true);
				}else{
					for(int j=0;j<trg-'0';j++){
						field.get(field.size()-1).add(false);
					}
				}
			}
			int[] s = {in.nextInt()-1,in.nextInt()-1};
			int[] g = {in.nextInt()-1,in.nextInt()-1};
			
			field.get(s[0]).set(s[1],false);
			field.get(g[0]).set(g[1],true);
			
			StringBuffer buffer = new StringBuffer();
			for(int i=0;i<field.size();i++){
				for(int j=0;j<field.get(i).size();j++){
					if(field.get(i).get(j)){
						buffer.append('b');
					}else{
						int count = 1;
						while(j+count<field.get(i).size() &&
								!field.get(i).get(j+count)){
							count ++;
						}
						buffer.append(count);
						j += count -1;
					}
				}
				buffer.append((i==field.size()-1)?"":'/');
			}
			System.out.println(buffer.toString());
		}
	}
}