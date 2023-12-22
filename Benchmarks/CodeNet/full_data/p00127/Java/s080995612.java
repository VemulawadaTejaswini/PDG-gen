import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			boolean flag = true;
			if(s.length()%2==1) flag = false;
			char[] t = new char[s.length()/2];
			int a = 0;
			int b = 0;
			
			for(int i=0;i<s.length()/2;i++){
				a = s.codePointAt(2*i)-48;
				b = s.codePointAt(2*i+1)-48;
				if(a<1 || a>6 || b<1 || b>5 || flag==false){
					System.out.println("NA");
					flag = false;
					break;
				}
				
				if(a==6){
					if(b==1) t[i] = 'z';
					else if(b==2) t[i] = '.';
					else if(b==3) t[i] = '?';
					else if(b==4) t[i] = '!';
					else if(b==5) t[i] = ' ';
				}else{
					t[i] = (char)(91+5*a+b);
				}
			}
			if(flag==true){
				for(int i=0;i<t.length;i++) System.out.print(t[i]);
				System.out.println();
			}
			
		}
	}	
}