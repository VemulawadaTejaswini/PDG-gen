import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String str=scan.next();
    	int C=-1;
    	int F=-1;
    	for(int i=0;i!=str.length();i++) {
    		if(str.charAt(i)=='C') {
    			C=i;
    		}if(str.charAt(i)=='F') {
    			F=i;
    		}
    	}
    	if(C!=-1&&F!=-1&&C<F) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
    }
}