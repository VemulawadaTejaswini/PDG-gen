import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		String p=sc.next();
		int state=0;
		int a=0;
		boolean yn=false;
		while(true){
			if(state==0){
				for(int i=a;i<s.length();i++){
					if(s.charAt(i)==p.charAt(0)){
						state=1;
						a=i;
						break;
					}
				}
				if(state==0){
					break;
				}
			}else if(state==1){
				for(int j=1;j<p.length();j++){
					int k=(a+j)%s.length();
					if(s.charAt(k)!=p.charAt(j)){
						state=0;
						a++;
						break;
					}
				}
				if(state==1){
					yn=true;
					break;
				}
			}
		}
		if(yn){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}