import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++){
			String[] coms = br.readLine().split(" ");
			if(coms[0].equals("insert")){
				list.add(coms[1]);
			}else if(coms[0].equals("find")){
				Iterator<String> it = list.iterator();
				boolean flag = false;
				while(it.hasNext()){
					String str = it.next();
					if(coms[1].equals(str)){
						System.out.printf("%s\n", "yes");
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.printf("%s\n", "no");
			}
		}
	}
}