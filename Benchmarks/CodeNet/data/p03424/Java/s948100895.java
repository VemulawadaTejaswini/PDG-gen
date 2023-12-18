import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int flag = 1;
	String[] s = new String[n];
	for(int i = 0; i < n; i++){
	    s[i] = scan.next();
	    if(s[i].charAt(0) == 'Y'){
		flag = -1;
	    }
	}

	if(flag == 1){
	    System.out.println("Three");
	}else{
	    System.out.println("Four");
	}
    }
}
	
