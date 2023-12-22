import java.util.Scanner;

public class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	int number[];
	number = new int[1000];
	int i=0;
	int sum=0;
	while(true){
	    for(i=0;i<1000;i++){
		number[i]=sc.nextInt();
		if(i==0 && number[i]==0) break;
		sum+=number[i];
		i++;
	    }
	    if(i==0 && number[i]==0) break;
	    for(i=0;i<1000;i++) number[i]=0;
	}
    }
}