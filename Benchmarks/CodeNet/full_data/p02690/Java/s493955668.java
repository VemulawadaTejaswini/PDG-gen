import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		for (int i = -65; i < 65; ++i){
			for (int k = -65; k < 65; ++k){
				if ((i*i*i*i*i)-(k*k*k*k*k)==x){
					System.out.print(i+" ");
					System.out.print(k);
					System.exit(0);
				}
			}

		}
	}
}

//end