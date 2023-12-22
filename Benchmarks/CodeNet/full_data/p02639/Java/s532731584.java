import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int loo = 0;
		while(loo++<6) {
			if(inputs.nextInt()==0) {
				System.out.println(loo);
				break;
			}
		}
	}

}
