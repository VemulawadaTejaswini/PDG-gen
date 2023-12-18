import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main{
	String s;

	public Main(String str){
		s = str;
	}
	public int searchA(){
		return s.indexOf("A");
	}
	public int searchZ(){
		return s.lastIndexOf("Z") + 1;
	}

	public static void main(String[] args){
		String str = null;
		File file = new File(args[0]);
		try(BufferedReader reader = new BufferedReader(new FileReader(file));){
			str = reader.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}
		Main m = new Main(str);
		int start = m.searchA();
		int end = m.searchZ();
		System.out.println(end - start);

	}
}

