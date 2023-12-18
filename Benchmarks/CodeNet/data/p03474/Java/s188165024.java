import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();
		String ans="No";
		
		for(int i=0; i<a; i++){
		    if(Integer.parseInt(str.substring(i,i+1))>=0 && Integer.parseInt(str.substring(i,i+1))<=9){
		        ans = "Yes";
		    }
		}
		
		if(str.substring(a,a+1).equals("-") && ans=="Yes"){
		    ans = "Yes";
		}
		
		for(int i=a+1; i<a+b+1; i++){
		    if(Integer.parseInt(str.substring(i,i+1))>=0 && Integer.parseInt(str.substring(i,i+1))<=9 && ans=="Yes"){
		        ans = "Yes";
		    }
		}
		
        System.out.println(ans);
	}
}
