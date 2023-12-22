import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, h, l, c;
	String s="a";
	while(true){
	    String line = sc.next();
	    System.out.println(line);
	    if(line.equals("-")) break;
	    n = sc.nextInt();
	    for(int i=0;i<n;i++){
		h = sc.nextInt();
System.out.println(line.substring(h));
System.out.println(line.substring(0,h));

		line = line.substring(h)+line.substring(0,h);
	    }
	    System.out.println(line);
	}
    }
}