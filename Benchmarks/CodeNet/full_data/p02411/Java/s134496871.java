import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	while(true){
	    int m=sc.nextInt();
	    int f=sc.nextInt();
	    int r=sc.nextInt();
	    if(m==-1&&f==-1&&r==-1)break;
	    String ans="A";
	    if(m+f<80)ans="B";
	    if(m+f<65)ans="C";
	    if(m+f<50){
		if(r>=50)ans="C";
		else ans="D";
	    }
	    if(m+f<30)ans="F";
	    if(m==-1||f==-1)ans="F";
	    System.out.println(ans);
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}