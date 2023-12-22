import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int sa=0;

		try {
			while(true) {
				str=bfr.readLine();
				if(str=="") {
					System.exit(0);
				}
				stk=new StringTokenizer(str," ");
				sa=(Integer.parseInt(stk.nextToken()))-(Integer.parseInt(stk.nextToken()));
				System.out.println(sa);
			}

		} catch (IOException e) {
			System.exit(0);
		}

		catch (NoSuchElementException e) {
			System.exit(0);
		}
	}
}
