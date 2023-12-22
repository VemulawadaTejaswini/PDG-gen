import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public void exec() throws IOException {
        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
        	if(i%3==0 || appearance3(i)) {
        		sb.append(" ").append(i);
        	}
        }
        out.println(sb.toString());
        out.flush();
        input.close();
    }
    
    private boolean appearance3(int num) {
    	for(;num>0; num/=10) {
    		if(num % 10 == 3) return true;
    	}
    	return false;
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }

}
 