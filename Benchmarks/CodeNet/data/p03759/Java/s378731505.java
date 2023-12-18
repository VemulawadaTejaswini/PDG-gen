import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int a=stdIn.nextInt();
	int b=stdIn.nextInt();
	int c=stdIn.nextInt();
	int i=Math.abs(b-a);
	int j=Math.abs(c-b);
	if(i==j){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
	
