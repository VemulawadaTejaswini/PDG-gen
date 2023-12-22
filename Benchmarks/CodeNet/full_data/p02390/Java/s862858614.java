import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        
        int suuti=Integer.parseInt(str);
	
	int zkn = suuti / 3600;
	int hun = (suuti % 3600 ) / 60;
	int byo = suuti % 60;
       
        System.out.println(zkn+ ":" +hun+ ":" +byo);
    }
}