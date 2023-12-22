import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int count=1;
    	StringBuilder sb = new StringBuilder();
    	while(true){
    	    int a = Integer.parseInt(sc.nextLine());
    	    if(a==0){
    	    	break;
    	    }


                  String i = Integer.toString(count);
                  String b = Integer.toString(a);
                  sb.append("Case ").append(i).append(": ").append(b).append("\n");

            count++;
    	}
    	System.out.println(sb);
    }
}