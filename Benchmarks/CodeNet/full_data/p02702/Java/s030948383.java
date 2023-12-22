import java .util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int count=0;

	for(int i=s.length()-1;i>0;i--){
	    for(int j=0;j<=i;j++){
		String ss = s.substring(j,i+1);
		long sl = Long.parseLong(ss);
		if(sl%2019==0) count++;
	    }
	}
	System.out.print(count);
    }
}
