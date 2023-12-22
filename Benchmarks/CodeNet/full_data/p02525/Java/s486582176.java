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
		}
	    double a=0,v=0,s=0;
	    for(int j=0;j<scores.length;j++){
            sum=sum+scores[j];
            a=sum/n;
            v=v+(scores[j]-a)*(scores[j]-a);
            s=v/n;
        }
	    System.out.println(Math.sqrt(s));
	}
    }
}