
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
      	@SuppressWarnings("resource")
		String n = new Scanner(System.in).nextLine();
      	@SuppressWarnings("resource")
		String a = new Scanner(System.in).nextLine();
      	int N = Integer.parseInt(n);
      	int p = 0;
        String[] b = a.split(" ");
      	for (int j=0;j<N-1;j++){
      		if(Integer.parseInt(b[j])==Integer.parseInt(b[j+1])){
      				p++;
      				b[j+1] = "100";
      		}
      	}
      	System.out.println(p);
    }
}