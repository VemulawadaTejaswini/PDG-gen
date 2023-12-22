package spring;
import java.util.Scanner;

public class Signboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String name = sc .next();
		int count =0;
		for(int x=0; x<N; x++){
			String oldname = sc.next();
			
			label:for(int a=0; a<oldname.length(); a++){
			    if(name.charAt(0) == oldname.charAt(a));
			    int b=1;
			    if(name.charAt(1) == oldname.charAt(b));
			    int c=b-a;
			    for(int d=b+c; d<oldname.length(); d+=c) {
			    	if(name.charAt(3)==oldname.charAt(d)) break;
			    	else {
			    		if(name.charAt(name.length()-1)==d) {
			    			count++;
			    			break label;
			    		}
			    		d++;
			    	}
					
				}
			}
		}
		System.out.println(count);
	}
}
				