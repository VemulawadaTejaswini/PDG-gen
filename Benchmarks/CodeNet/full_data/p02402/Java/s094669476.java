import java.util.*;
class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	long max=-1000000;
	long min=1000000;
	long sum=0;
	long[] data=new long[a];
	for(int i=0;i<a;i++){
	    data[i]=sc.nextInt();
	    if(data[i]>max) max=data[i];
			      
	    if(data[i]<min) min=data[i];
	    sum+=data[i];
	}
	System.out.println(min+" "+max+" "+sum);
    }
}