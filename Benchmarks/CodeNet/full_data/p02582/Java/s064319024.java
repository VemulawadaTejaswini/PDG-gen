import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] d = sc.next().toCharArray();
		int count = 0;
		if(d[0] == 'R' && d[1] == 'R' && d[2] == 'R')
		System.out.println("3");
		else if(d[0] == 'S' && d[1] == 'S' && d[2] == 'S')
		System.out.println("0");
		else if(d[0] == 'R' && d[1] == 'R' && d[2] == 'S')
		System.out.println("2");
		else if(d[0] == 'S' && d[1] == 'R' && d[2] == 'R')
		System.out.println("2");
		else
		System.out.println("1");
    }
}