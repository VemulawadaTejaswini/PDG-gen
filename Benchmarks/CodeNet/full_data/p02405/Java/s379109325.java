import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] st=s.split(" ");
		for(;;){
			int a=Integer.parseInt(st[0]);
			int b=Integer.parseInt(st[1]);
			if(a==0&&b==0)break;
			for(int i=1;i<=a;i++){
				if(i%2==1){System.out.print("#");}
				for(int l=1;l<b;l++){
					if(l%2==1)System.out.print(".");
					else System.out.print("#");
					
				}
				if(i%2==0) System.out.println(".");
				else System.out.println();
			}System.out.println();
		}
		

	}
}