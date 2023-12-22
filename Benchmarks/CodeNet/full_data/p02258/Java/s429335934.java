import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a,d;
	a=sc.nextInt();

	int[] b=new int[a];

	for(int i=0;i<a;i++){
	    b[i]=sc.nextInt();
	}
	d=-1000000000;
	for(int i=0;i<a;i++){
	    for(int j=i+1;j<a;j++){
		if(d<=b[j]-b[i])d=b[j]-b[i];
	    }
	}
	System.out.println(d);
    }
    public static void main (String[]arg){
	new Main();
    }
}