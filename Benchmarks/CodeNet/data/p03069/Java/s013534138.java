import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();

	int index = n;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == '#'){
		index = i;
		break;
	    }
	}

	int count = 0;
	for(int i = index+1; i < n; i++){
	    if(s.charAt(i) == '.'){
		count++;
	    }
	}
		
	System.out.println(count);
    }
}
