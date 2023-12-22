import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		char c = 0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();

		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes == null){
				break;
			}
			if(tes.equals("")){
				break;
			}
			try{
				String[] fruit = tes.split(" ", 0);
				al.add(Integer.parseInt(fruit[0]));
				al2.add(Integer.parseInt(fruit[1]));
				al3.add(Integer.parseInt(fruit[2]));
			}catch(NumberFormatException e){
				break;
			}

			
			//al.add(a);
		}
		
		for(int r=0;r<al.size();r++){
			boolean e = false;
			int pri = 0;
			
			for(int i=1;i<=10;i++){
				if(al.get(r) == i || al2.get(r) == i || al3.get(r) == i){
					continue;
				}
				
				if(al.get(r)+al2.get(r)+i <= 20){
					pri++;
				}
			}
			if(pri <= 4){
				e =true;
			}
			if(e){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
		
		
	}

}