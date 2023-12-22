import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int y;
	for(int i=0;i<a;i++){
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    y=b%c;
	    if(y==0)y=c;
	    System.out.println(y);
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}