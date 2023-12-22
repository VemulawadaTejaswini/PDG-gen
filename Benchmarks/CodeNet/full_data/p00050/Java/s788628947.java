import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String str = reader.readLine();
			String[] st = str.split(" ");
			
			for(int i = 0; i < st.length; i++){
				if(st[i].equals("apple")){
					st[i] = "peach";
					continue;
				}
				if(st[i].equals("peach")){
					st[i] = "apple";
					continue;
				}
				if(st[i].equals("apple.")){
					st[i] = "peach.";
					continue;
				}
				if(st[i].equals("peach.")){
					st[i] = "apple.";
					continue;
				}
			}
			for(int i = 0; i < st.length; i++)
				if(i != st.length - 1)
					System.out.print(st[i] + " ");
				else
					System.out.println(st[i]);
			
				reader.close();
		}catch(IOException e){
		}
		}
}