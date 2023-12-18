    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String insert = sc.next();

    	String first = insert.substring(0,1);
    	String last = insert.substring((insert.length() - 1),insert.length());
    	String middle = insert.substring(1,(insert.length() - 1));
    	int middle_mojisu =  middle.length();

    	System.out.println(first + middle_mojisu + last);
    	}
    }