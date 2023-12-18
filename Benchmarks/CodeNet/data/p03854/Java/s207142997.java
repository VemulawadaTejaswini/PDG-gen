import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String S = scan.next();

	int len = S.length();
	int flag = 1;
	while(len != 0){
	    if(len >= 7 && S.substring(len-7,len).compareTo("dreamer") == 0){
		S = S.substring(0, len-7);
		len -= 7;
	    }else if(len >= 6 && S.substring(len-6,len).compareTo("eraser") == 0){
		S = S.substring(0, len-6);
		len -= 6;
	    }else if(S.substring(len-5,len).compareTo("erase") == 0){
		S = S.substring(0, len-5);
		len -= 5;
	    }else if(S.substring(len-5,len).compareTo("dream") == 0){
		S = S.substring(0, len-5);
		len -= 5;
	    }else{
		flag = -1;
		break;
	    }
	}

	if(flag == 1){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
