import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int n=sc.nextInt();
	int f=sc.nextInt();
	int min=f;
	int max=f;
	long sum=f;
	for(int i=0;i<n-1;i++){
	    int x=sc.nextInt();
	    if(min>x)min=x;
	    if(max<x)max=x;
	    sum+=x;
	}
        System.out.println(min+" "+max+" "+sum);
    }
    public static void main(String[]ag){
	new Main().main();
    }
}