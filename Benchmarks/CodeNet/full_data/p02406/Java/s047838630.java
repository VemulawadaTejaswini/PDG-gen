import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	    boolean e=false;
	    if(i%3==0)e=true;
	    for(int j=1;j<100000;j*=10)if(i/j%10==3)e=true;
	    if(e)System.out.print(" "+i);
	}
	System.out.println();
    }
    public static void main(String[]ag){
	new Main().main();
    }
}