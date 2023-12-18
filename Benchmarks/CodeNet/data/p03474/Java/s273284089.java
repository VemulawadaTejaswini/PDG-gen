import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();
		String ans="No";
		
		for(int i=0; i<a; i++){
		    if(Character.isDigit(str.charAt(i))){
		        ans = "Yes";
		    }
		}
		
		if(str.substring(a,a+1).equals("-") && ans=="Yes"){
		    ans = "Yes";
		}else{
		    ans = "No";
		}
		
		for(int i=a+1; i<a+b+1; i++){
		    if(Character.isDigit(str.charAt(i)) && ans=="Yes"){
		        ans = "Yes";
		    }else{
		        ans = "No";
		    }
		}
		
        System.out.println(ans);
	}
}
