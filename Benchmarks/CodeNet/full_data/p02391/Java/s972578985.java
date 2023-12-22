import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			String[] box = input.split(" ");
			int a = Integer.parseInt(box[0]);
			int b = Integer.parseInt(box[1]);
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