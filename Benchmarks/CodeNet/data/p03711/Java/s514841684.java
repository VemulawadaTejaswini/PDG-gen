import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	String result = "No";
	if((x==2&&y==2)||(x%2==1&&y%2==1)||(x%2==0&&y%2==0&&x!=2&&y!=2)){
	    result = "Yes";
	}
	System.out.println(result);
    }
}
	
