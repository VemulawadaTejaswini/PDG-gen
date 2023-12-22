import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
			String a1,a2;
			int al;
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			int b = sc.nextInt();
			al = a.length();
			
			for(int c=0;c<b;++c){
				String d = sc.next();
				if(d.equals("replace")){
					int e = sc.nextInt();
					int f = sc.nextInt();
					String g = sc.next();
					a1 = a.substring(0, e);
					a2 = a.substring(f+1, al);
					a = a1 + g + a2;
				}
				if(d.equals("reverse")){
					int e = sc.nextInt();
					int f = sc.nextInt();
					a1 = a.substring(0, e);
					a2 = a.substring(f+1, al);
					for(f=f;f>=c;f-=1){
						a1 = a1 + a.substring(f,f+1);
					}
					a = a1+a2;
				}
				if(d.equals("print")){
					int e = sc.nextInt();
					int f = sc.nextInt();
					a1 = a.substring(e,f+1);
					System.out.println(a1);
				}
			}
	}

}