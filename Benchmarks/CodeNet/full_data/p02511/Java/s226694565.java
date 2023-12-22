import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(in.hasNextInt()){
			int n=in.nextInt();
			if(n==0)break;
			int p=in.nextInt(),s=p,e;
			String l="";
			l+=s;
			for(int i=1;i<n;i++){
				e=in.nextInt();
				if(e!=p+1){
					l+=((s!=p)?("-"+p):"")+" "+e;
					s=p=e;
				}
				if(i==n-1)l+=((s!=e)?("-"+e):"");
				p=e;
			}
			System.out.println(l);
		}
	}
}