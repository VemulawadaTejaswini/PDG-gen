import java.util.*;

public class B{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count[] = new int[4];
	String s[] = new Sting[N];
	for(int i=0; i<N; i++){
	    s[i]= sc.nextLine();
	    switch(s[i]){
	    case "AC":
		count[0]++;
	    case "WA":
		count[1]++;
	    case "TLE":
		count[2]++;
	    case "RE":
		count[3]++;
	    }
	}
	System.out.println("AC x "+count[0]);
	System.out.println("WA x "+count[1]);
	System.out.println("TLE x "+count[2]);
	System.out.println("RE x "+count[3]);
    }
}