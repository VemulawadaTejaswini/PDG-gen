import java.io.*;
class Main {
 	public static void main(String[] args) throws IOException
	{
	BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

	String str1 = br.readLine();
	String str2 = br.readLine();
	String str3 = br.readLine();

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Integer.parseInt(str3);

		if(a < b && b < c){
		System.out.println(a + " " + b + " " + c );
		}

		else if(a < c && c < b){
		System.out.println(a + " " + c + " " + b );
		}

		else if(b < a && a < c){
		System.out.println(b + " " + a + " " + c);
		}

		else if(b < c && c < a){
		System.out.println(b + " " + c + " " + a );
		}


		else if(c < a && a < b){
		System.out.println(c + " " + a + " " + b );
		}


		else if(c < b && b < a){
		System.out.println(c + " " + b + " " + a );
		}
	}
}