import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		String p="P";
		String w="W";
		String g="G";
		String y="Y";
		int count=0;
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			if(p.equals(s[i])){
				count++;
				p="";
			}
			if(w.equals(s[i])){
				count++;
				w="";
			}
			if(g.equals(s[i])){
				count++;
				g="";
			}
			if(y.equals(s[i])){
				count++;
				y="";
			}
		}
		switch(count){
		case 1:System.out.println("One");break;
		case 2:System.out.println("Two");break;
		case 3:System.out.println("Three");break;
		case 4:System.out.println("Four");break;
		default:break;
		}
		
	}

}