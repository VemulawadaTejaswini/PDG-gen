import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			
			boolean flag = true;
			int max = 1;
			int i = 3;
			int count = 0;
			String ans = "egg";
			
			if(s.charAt(0)=='c'){
				ans = "chicken";
				flag = false;
				i=7;
			}
			
			while(i<s.length()){
				count++;
				if(s.charAt(i)=='e' && flag==false){
					flag = true;
					i+=3;
				}else if(s.charAt(i)=='c' && flag==true){
					flag = false;
					i+=7;
				}else if(s.charAt(i)=='e' && flag==true){
					if(max<count){
						max = count;
						ans = "egg";
					}
					i+=3;
					count=0;
				}else if(s.charAt(i)=='c' && flag==false){
					if(max<count){
						max = count;
						ans = "chicken";
					}
					i+=7;
					count=0;
				}	
			}
			count++;
			
			if(flag==true) i-=3;
			else if(flag==false) i-=7;
			
			if(s.charAt(i)=='e' && max<count) ans = "egg";
			else if(s.charAt(i)=='c' && max<count) ans = "chicken";

			System.out.println(ans);
		}
	}	
}