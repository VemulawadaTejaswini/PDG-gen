import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();

			for(int i=0;i<n;i++){
				String word = stdIn.next();
				System.out.println(word.replaceAll("Hoshino","Hoshina"));
			}
		}
	}
}