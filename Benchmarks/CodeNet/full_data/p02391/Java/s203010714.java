import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        String str2=br.readLine();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

	if( a > b ){
	System.out.println("a>b");}

	else if( a < b ){
	System.out.println("a<b");}

	else if(a == b){        
	System.out.println("a == b");}
    }
}