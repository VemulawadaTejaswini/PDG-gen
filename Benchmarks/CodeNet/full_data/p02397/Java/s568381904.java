import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        for(int i=0;;i++){
        	String items[]=reader.readLine().split(" ");
        	int num1=Integer.parseInt(items[0]);
        	int num2=Integer.parseInt(items[1]);
            if(num1==0 && num2==0){
            	break;
            }
        	if(num1<num2){
            	sb.append(Integer.toString(num1) + " " + Integer.toString(num2) + "\n");
        	}else{
            	sb.append(Integer.toString(num2) + " " + Integer.toString(num1) + "\n");
        	}
        }
        System.out.println(sb);
	}
}