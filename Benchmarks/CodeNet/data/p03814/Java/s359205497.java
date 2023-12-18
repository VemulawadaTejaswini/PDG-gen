import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca=new Scanner(System.in);
		String s=sca.next();
		int i=0,j=0;
		int count=0;
		
		for(i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				for(j=i;j<s.length();j++){
					if(s.charAt(j)=='Z'&&count<j-i){
						count=j-i;
					}
				}
			}
		}
		
		System.out.print(count+1);
		

	}

}
