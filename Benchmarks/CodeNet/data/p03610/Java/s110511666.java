import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	String input=scanner.next();

    	String[] data=input.split("");

    	StringBuilder sb =new StringBuilder();


    	for(int i=0;i<=input.length();i+=2) {

    		sb.append(data[i]);


    	}

    	String result=sb.toString();

    	System.out.println(result);

    	scanner.close();


    }

}