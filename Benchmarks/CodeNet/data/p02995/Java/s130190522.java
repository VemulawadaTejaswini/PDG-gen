import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		//long AA=0;
		//long BB=0;
		int count=0;
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Long> list=new ArrayList<Long>();
		for(int i=0;b-a+1>i;i++) {
			list.add(a+i);
		}
		/*
		if(c<d) {
		for(int i=0;c>i;i++) {
			a++;
			if(a%c==0) {
				AA=a;
				break;
			}
		}
		for(int i=0;d>i;i++) {
			a++;
			if(a%d==0) {
				BB=a;
			}
		}
		}

		else {
			for(int i=0;d>i;i++) {
				a++;
				if(a%d==0) {
					BB=a;
				}
			}
			for(int i=0;c>i;i++) {
				a++;
				if(a%c==0) {
					AA=a;
					break;
				}
			}
		}
		long AAA=b-AA;
		long BBB=b-BB;

		long countAA=AAA/c;
		long countBB=BBB/d;

		while(true) {

		}
		*/


		loop:for(int i=0;b-a+1>i;i++) {
			if(list.get(i)%c==0) {
				continue;
			}
		    else if(list.get(i)%c!=0) {
		    	if(list.get(i)%d==0) {
		    		continue loop;
		    	}
		        else if(list.get(i)%d!=0) {
					count++;
				}
			}
		}



		System.out.println(count);
	}

}

//314159265358979323 846264338327950288 419716939 937510582

