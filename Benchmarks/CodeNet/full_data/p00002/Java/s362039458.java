import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class AOJ_0002 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		int b=0;
		int[] data=new int[200];
		String str1=null;
		String str2;
		
		
		int count=0;
		while((str1=buf.readLine())!=null){
			
			 a=Integer.parseInt(str1.split(" ")[0]);
			 b=Integer.parseInt(str1.split(" ")[1]);
			 str2=Integer.toString(a+b);
			 data[count]=str2.length();
			 count++;
			 
			
		}
		buf.close();
		for(int i=0;i<count;i++){
			System.out.println(data[i]);
		}
	}
}