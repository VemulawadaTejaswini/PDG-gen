import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rst;
		
		while(true) {
			if(!s.contains("dream")&&!s.contains("erase")) {
				break;
			}
			if(s.indexOf("erase")==0) {
				if(s.indexOf("eraser")==0) {
					s=s.replace("eraser","");
				}else{
					s=s.replace("erase","");
				}
				
			}
			if(s.indexOf("dream")==0) {
				if(s.indexOf("dreamer")==0&&s.indexOf("erase")!=5) {
					s=s.replace("dreamer", "");
				}else {
					s=s.replace("dream", "");
				}
				
			}
			
		}
		
			
		
		if(s.length()==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}