import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int c=1;
	while(true){
	    int x=sc.nextInt();
	    if(x==0)break;
	    System.out.println("Case "+c+": "+x);
	    c++;
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}