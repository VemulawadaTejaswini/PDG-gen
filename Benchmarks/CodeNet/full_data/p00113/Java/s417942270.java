import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){
			List<Integer> rest = new ArrayList<Integer>();
			String[] dst = line.split(" ");
			int p = Integer.parseInt(dst[0]);
			int q = Integer.parseInt(dst[1]);

			if(p == 0 && q == 0){
				break;
			}

			rest.add(p);

			String num = "";
			String repeat = "";

			while(true){
				int x = 10 * p / q;
				p = 10 * p - x * q;
				num += Integer.toString(x);

				if(p == 0){
					break;
				}

				if(rest.contains(p)){
					int start = rest.indexOf(p);
					for(int i=0; i<rest.size(); i++){
						if(i<start){
							repeat += " ";
						}else{
							repeat += "^";
						}
					}
					break;
				}
				rest.add(p);


			}

			Ans.add(num);
			if(repeat.length() != 0){
				Ans.add(repeat);
			}
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
}