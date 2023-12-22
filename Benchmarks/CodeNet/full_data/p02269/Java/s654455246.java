import java.util.ArrayList;
import java.io.*;

public class Main {
	public static void main(String[] args)throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> dic=new ArrayList<String>();
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] str=(br.readLine().split(" "));
			if (str[0].equals("insert")){
				dic.add(str[1]);
			} else if (str[0].equals("find")){
				if (dic.contains(str[1])){
					System.out.println("yes");
				}else System.out.println("no");
			}
		}
	}
}