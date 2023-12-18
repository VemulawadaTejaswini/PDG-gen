import java.util.Scanner;

    class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String s = scan.next();

        scan.close();

        if (s.equals("SUN"))
        System.out.print(7);
       else if(s.equals("MON"))
        	System.out.print(6);
        else if(s.equals ("TUE"))
        	System.out.print(5);
        else if(s.equals("WED"))
        	System.out.print(4);
        else if(s.equals("THU"))
        	System.out.print(3);
        else if(s.equals ("FRI"))
        	System.out.print(2);
        else
        System.out.print(1);
	}

}
