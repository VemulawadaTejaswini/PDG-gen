import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),min=999999;
    String buffa="",buffb="";
    for(int i=1;i<n;i++) {
    	int a=i,b=n-i,sum=0;
    	buffa=String.valueOf(a);
    	buffb=String.valueOf(b);
    	for(int j=0;j<buffa.length();j++)sum+=Integer.valueOf(buffa.substring(j, j+1));
    	for(int j=0;j<buffb.length();j++)sum+=Integer.valueOf(buffb.substring(j, j+1));
    	min=Math.min(sum, min);
    	//if(sum==1)System.out.println(buffa+"+"+buffb+":"+sum);
    }
    System.out.println(min);
  }
}
