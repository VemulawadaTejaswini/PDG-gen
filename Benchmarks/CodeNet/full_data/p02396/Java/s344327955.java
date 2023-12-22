import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	int count=1;
    	StringBuilder sb = new StringBuilder();
    	while(true){

        Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();

    	    if(1<=a&&a<=10000){
                  String i = Integer.toString(count);
                  String b = Integer.toString(a);
                  sb.append("Case ").append(i).append(": ").append(b).append("\n");


    	    }
    	    if(a==0){
    	    	break;
    	    }
            count++;
    	}
    	System.out.println(sb);
    }
}