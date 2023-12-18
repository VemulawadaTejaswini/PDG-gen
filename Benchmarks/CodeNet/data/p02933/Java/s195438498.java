import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanncer sc = new Scanner(System.in);
    	int a = Integer.parseInt(sc.nextLine());
        int s = sc.nextLine();
        if(a >= 3200) System.out.println(s);
        else System.out.println("red");
    }
}