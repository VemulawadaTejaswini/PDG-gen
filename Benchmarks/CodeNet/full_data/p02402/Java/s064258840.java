import java.util.*;
class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int max=-1000000;
	int min=1000000;
	int sum=0;
	long[] data=new data[a];
	for(int i=0;i<a;i++){
	    data[i]=sc.nextInt();
	    if(data[i]>max) max=n;
	    if(data[i]<min) min=n;
	    sum+=data[i];
	}
	System.out.println(min+" "+max+" "+sum);
    }
}