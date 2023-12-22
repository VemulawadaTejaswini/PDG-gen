import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		char c = 0;


		//ArrayList<Double> al = new ArrayList<Double>();
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		int eee3 = 0;
		String[] fruit3 = tes.split(" ", 0);
		for(int k=0;k<26;k++){
			StringBuffer t = new StringBuffer();
			for(int i=0;i<fruit3.length;i++){
				for(int j=0;j<fruit3[i].length();j++){
					c = fruit3[i].charAt(j);
					if(String.valueOf(fruit3[i].charAt(j)).matches("[a-z]")){
						c = (char) (fruit3[i].charAt(j) + k);
						if(c > 122){
							c = (char) (96 + c -122);
						}
					}
					t.append(c);
				}
				t.append(' ');
			}
			String sss = new String(t);
			String[] fruit2 = sss.split(" ", 0);
			for(int i=0;i<fruit2.length;i++){
				if(fruit2[i].equals("the") || fruit2[i].equals("this") || fruit2[i].equals("that") ){
					eee3 = 1;
					break;
				}
			}
			if(eee3 == 1){
				tes = sss;
				break;
			}
		}
		System.out.println(tes);
		//double a = Double.parseDouble(tes);
		//al.add(a);

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
			
			int eee = 0;
			String[] fruit = tes.split(" ", 0);
			for(int k=0;k<26;k++){
				StringBuffer t = new StringBuffer();
				for(int i=0;i<fruit.length;i++){
					for(int j=0;j<fruit[i].length();j++){
						c = fruit[i].charAt(j);
						if(String.valueOf(fruit[i].charAt(j)).matches("[a-z]")){
							c = (char) (fruit[i].charAt(j) + k);
							if(c > 122){
								c = (char) (96 + c -122);
							}
						}
						t.append(c);
					}
					t.append(' ');
				}
				String sss = new String(t);
				String[] fruit2 = sss.split(" ", 0);
				for(int i=0;i<fruit2.length;i++){
					if(fruit2[i].equals("the") || fruit2[i].equals("this") || fruit2[i].equals("that") ){
						eee = 1;
						break;
					}
				}
				if(eee == 1){
					tes = sss;
					break;
				}
			}
			System.out.println(tes);
			
			//al.add(a);
		}
		
	}

}