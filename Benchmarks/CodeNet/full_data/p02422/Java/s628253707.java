import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int a,b;
	String after;
	String str1,str2,str3;
	String str_rep;
	

	String str = in.next();
	int n = in.nextInt();

	for(int i=0;i<n;i++){
	    after = in.next();
	    a = in.nextInt();
	    b = in.nextInt();
	    if(after.equals("print")){
		for(int j=a;j<=b;j++){
		    System.out.print(str.charAt(j));
		}
		System.out.println();
	    }else if(after.equals("reverse")){
		str1 = str.substring(0,a);
		StringBuffer str2_buffer = new StringBuffer(str.substring(a,b+1));
		str2_buffer = str2_buffer.reverse();
		str2 = str2_buffer.substring(0);
		str3 = str.substring(b+1);
		str = str1+str2+str3;
	    }else if(after.equals("replace")){
		str1 = str.substring(0,a);
		str2 = str_rep;
		str3 = str.substring(b+1);
		str = str1+str2+str3;
	    }
	}
    }
}

