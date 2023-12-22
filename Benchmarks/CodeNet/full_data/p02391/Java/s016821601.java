import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(reader.readLine());
			int b = Integer.parseInt(reader.readLine());
			if(a > b){
				System.out.println("a>b");
			}else if(a == b){
				System.out.println("a==b");
			}else{ 
			System.out.println("a<b");
			}
        }catch(IOException e){
            System.out.println(e);
        }
    }
}