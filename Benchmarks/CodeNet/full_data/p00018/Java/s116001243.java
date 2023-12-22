import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(s," ");
			ArrayList<String> list=new ArrayList<String>();
			while(st.hasMoreTokens()){
				list.add(st.nextToken());
			}
			Collections.sort(list);
			for (int i = list.size()-1; i >=0; i--) {
				System.out.print(list.get(i));
				if(i>0){
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}