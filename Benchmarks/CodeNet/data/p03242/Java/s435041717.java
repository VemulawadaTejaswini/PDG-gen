import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String  str = br.readLine();

	String[] ar = str.split("");

	for(int i=0; i<str.length(); i++){
	    if(ar[i].equals("9"))
		ar[i]="1";
	    else if(ar[i].equals("1"))
		ar[i]="9";
	}
	
	System.out.println(ar[0]+ar[1]+ar[2]);
    }
}