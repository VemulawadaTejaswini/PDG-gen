import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int minval = Integer.parseInt(std.next());;
		int maxpro = (int)-1e+9;
		int nextval = 0;
		for (int i=1; i<n; i++){
			nextval = Integer.parseInt(std.next());
			if(maxpro<(nextval-minval)){maxpro = nextval - minval;}
			if(nextval<minval){minval = nextval;}
		}
		System.out.println(maxpro);
	}
}