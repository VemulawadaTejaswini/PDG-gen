import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int ans=0;
		for(int i=0;i<N;i++){
			String s=stdIn.next();
			if(map.containsKey(s)==false){
				ans++;
				map.put(s,1);
			}
		}
		System.out.println(ans);
	}
}
