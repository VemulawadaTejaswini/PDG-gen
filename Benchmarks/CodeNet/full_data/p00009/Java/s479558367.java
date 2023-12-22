import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	    int count = 0;
	    int num=sc.nextInt();
	    if(num>=2) count++;
	    for(int i=3;i<=num;i+=2){
		int flag=0;
		for(int j=3;j<i;j+=2){
		    if(i%j==0) flag=1;
		}
		if(flag!=1) count++;
	    }
	    System.out.println(count);
	}
    }
}