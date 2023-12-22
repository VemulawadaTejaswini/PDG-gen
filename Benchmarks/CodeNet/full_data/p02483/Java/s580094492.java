import java.util.Scanner;
import java.util.*;

public class Main {
public static void main(String[] args) {
	List<Integer> num = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	num.add(a);
	int b =sc.nextInt();
	num.add(b);
	int c =sc.nextInt();
	num.add(c);
	
	Collections.sort(num);
	for(int i=0;i<3;i++){System.out.print(num.get(i)+" ");}
		}
	}