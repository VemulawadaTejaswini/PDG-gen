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

	int tmp1 = 0;
	for(int i = index+1; i < n; i++){
	    if(s.charAt(i) == '.'){
		tmp1++;
	    }
	}

	index = n;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == '.'){
		index = i;
		break;
	    }
	}

	int tmp2 = 0;
	for(int i = index+1; i < n-1; i++){
	    if(s.charAt(i) == '#'){
		tmp2++;
	    }
	}

	int count = 0;
	if(tmp1 > tmp2){
	    count = tmp2;
	}else{
	    count = tmp1;
	}
		
	System.out.println(count);
    }
}
