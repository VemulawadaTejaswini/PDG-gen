import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String ans="";
		String s="zabcdefghijklmnopqrstuvwxy";
  		String[] a=s.split("");
  		while(n>0){
        long b=n%26;
        ans=a[(int)b]+ans;
        n=n/26;
        }
		

    	System.out.println(ans);
    }
}