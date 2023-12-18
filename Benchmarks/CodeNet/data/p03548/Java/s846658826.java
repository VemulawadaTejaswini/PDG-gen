import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	x -= z;
	int cout = 0;
	while(x - (y + z) >= 0) {
		cout++;
		x -= y + z;
	}
	System.out.println(cout);
}
}