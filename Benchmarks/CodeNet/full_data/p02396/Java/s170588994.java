import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int count=1;
    	StringBuilder sb = new StringBuilder();
    	while(true){
    	    //int a = Integer.parseInt(sc.nextLine());
    	    int a = sc.nextInt();
    		if(a == 0){
    	    	break;
    	    }
             String b = Integer.toString(a);
             sb.append("Case ").append(Integer.toString(count++)).append(": ").append(b).append("\n");

    	}
    	System.out.print(sb);
    }
}