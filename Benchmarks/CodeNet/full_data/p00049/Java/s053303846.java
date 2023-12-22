import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=0,b=0,ab=0,o=0;
		while(in.hasNext()) {
			String blood = in.next().split(",")[1];
			if(blood.equals("A")) a++;
			else if(blood.equals("B")) b++;
			else if(blood.equals("AB")) ab++;
			else if(blood.equals("O")) o++;
		}
		System.out.printf("%d\n%d\n%d\n%d\n",a,b,ab,o);
	}
}