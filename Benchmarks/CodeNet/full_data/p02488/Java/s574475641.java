import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n;
	String ans="a";
	n=cin.nextInt();
	String[]x=new String[n];
	for(int i=0;i<n;i++){
		x[i]=cin.next();
	}
	for(int q=0;q<n;q++){
		int z=0;
		for(int j=0;j<n;j++){
			if(x[q].compareTo(x[j])<=0){
				z=z+1;
			}
		}
		if(z==n){
			ans=x[q];
		}
	}
	System.out.println(ans);
	}
}