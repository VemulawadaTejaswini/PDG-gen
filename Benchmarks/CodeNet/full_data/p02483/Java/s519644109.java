import java.util.Scanner;
import java.util.*;
public class Main {

	int s[]=new int[3];
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<s.length;i++){
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		for (int i =0;i<s.length -1 ;i++){
			System.out.print(s[i]+" ");
		}
		System.out.println(s[s.length-1]);
	}

	public static void main(String[] args) {
		Main obj = new Main();
        obj.doIt();

	}

}