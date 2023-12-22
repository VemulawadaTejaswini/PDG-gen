import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			
			while((line=r.readLine())!=null){
				ArrayList<String> push = new ArrayList<String>();
				
				int index=0;
				
				for(int i=index;i<line.length();i++){
					if(i==line.length()-1){
						push.add(line.substring(index,i+1));
						break;
					}
					if(line.charAt(i)!=line.charAt(i+1)){
						push.add(line.substring(index,i+1));
						index = i+1;
					}
				}
				
				for(String p:push){
					System.out.println("1: " + p);
				}
				
				
				for(String p:push){
					System.out.print(pushButton(p));
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String pushButton(String push){
		if(push.length()==0||push==null){
			return "";
		}
		String[][] keys = {{" "},
				{"'",",",".","!","?"},
				{"a","b","c","A","B","C"},
				{"d","e","f","D","E","F"},
				{"g","h","i","G","H","I"},
				{"j","k","l","J","K","L"},
				{"m","n","o","M","N","O"},
				{"p","q","r","s","P","Q","R","S"},
				{"t","u","v","T","U","V"},
				{"w","x","y","z","W","X","Y","Z"}
				};
		int index=push.length(),l=Integer.parseInt(push.substring(0,1));
		if(l==0){
			return push.substring(1).replaceAll("0", " ");
		}
		while(index>keys[l].length){
			index-=keys[l].length;
		}
		return keys[l][index-1];
	}
}