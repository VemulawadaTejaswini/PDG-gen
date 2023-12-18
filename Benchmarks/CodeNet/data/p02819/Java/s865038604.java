import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=x; ;i++){
			int k=i;
			boolean ch=false;
			for(int j=2; j<k; j++){
				if(k%j==0){
					ch=true;
					break;
				}
			}
			if(!ch){
				System.out.println(i);
				break;
			}
		}
	}
}
