import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc;
	ArrayList<Character> ar = new ArrayList<Character>();
	int n1=0,n2=0,n3=0;
	sc = new Scanner(System.in);
	while(n1!=-1&&n2!=-1&&n3!=-1){
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1>50||n2>50||n3>100){
			continue;
		}
	    if(n1==-1||n2==-1){
			ar.add('F');
		}
	    else if((n1+n2)>=80){
			ar.add('A');
		}
		else if((n1+n2)>=65){
			ar.add('B');
		}
		else if((n1+n2)>=50){
			ar.add('C');
		}
		else if((n1+n2)>=30){
			if(n3>=50){
				ar.add('C');
			}
			else if(n3<50){
				ar.add('D');
			}
		}
		else if((n1+n2)<30){
			ar.add('F');
		}
		
	}
	for(int n=0;n<ar.size()-1;n++){
		System.out.println(ar.get(n));
	}
	
}
}