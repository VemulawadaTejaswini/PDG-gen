import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();

		boolean flag=true;

		for(int i=S.length()-1;i>=0;i--){
			if(S.charAt(i)=='r'&&S.charAt(i-6)=='d'){
				i=i-6;
			}else if(S.charAt(i)=='r'&&S.charAt(i-5)=='e'){					
				i=i-5;
			}else if(S.charAt(i)=='m'&&S.charAt(i-4)=='d'){
				i=i-4;
			}else if(S.charAt(i)=='e'&&S.charAt(i-4)=='e'){
				i=i-4;
			}else{
				flag=false;	
				break;
			}
		}

		if(flag){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
