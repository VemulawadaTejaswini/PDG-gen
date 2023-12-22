
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main (String[] args){


	Scanner sc =new Scanner(System.in);
	ArrayList<String> list=new ArrayList<String>();


	while(sc.hasNextLine()) {
		list.add(sc.nextLine());
	}
	
	int AC=0;
	int WA=0;
	int TLE=0;
	int RE=0;
	
	int num= Integer.parseInt(list.get(0))+1;
	
	for(int i=1; i<num;i++) {
		if(list.get(i).equals("AC")) {
			AC++;
		}
		if(list.get(i).equals("WA")) {
			WA++;
		}
		if(list.get(i).equals("TLE")) {
			TLE++;
		}
		if(list.get(i).equals("RE")) {
			RE++;
		}
	}
	
	System.out.println("AC x "+AC);
	System.out.println("WA x "+WA);
	System.out.println("TLE x "+TLE);
	System.out.println("RE x "+RE);

}}


