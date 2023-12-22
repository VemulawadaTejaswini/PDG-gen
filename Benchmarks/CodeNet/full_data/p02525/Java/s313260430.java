import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();
	    if(n==0){
		break;
	    }
	    int [] scores=new int[n];
	    int sum=0;
	    for(int i=0;i<scores.length;i++){
		scores[i]=sc.nextInt();
		sum=sum+scores[i];
	    }
	    double a=0,v=0;
	    a=sum/n;
	    for(int j=0;j<scores.length;j++){
		v=v+(scores[j]-a)*(scores[j]-a)/n;
	    }
	    System.out.println(Math.sqrt(v));
	}
    }
}