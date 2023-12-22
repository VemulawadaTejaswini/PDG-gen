
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	static long base=99731;
	static long mod=67280421310721l;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			String[] str=new String[2];
			HashSet<Long> set=new HashSet<>();
			for(int i=0;i<n;i++){
				str=br.readLine().split("\\s+");
				long hash=calc(str[1]);
				if(str[0].equals("insert")){
					set.add(hash);
				}
				else if(set.contains(hash)){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static long calc(String string) {
		// TODO Auto-generated method stub
		long hash=0;
		for(int i=0;i<string.length();i++){
			int c=string.charAt(i);
			hash=(hash*base)%mod;
			hash+=c;
			hash=hash%mod;
		}
		return hash;
	}

}

