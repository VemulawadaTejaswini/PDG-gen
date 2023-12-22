import java.util.Scanner;
public class Main {
	public static char check(char ch[]) {
		int i;
		for(i=0;i+2<9;i+=3){
			if(ch[i]==ch[i+1] && ch[i+1]==ch[i+2]) return ch[i];
		}
		for(i=0;i<3;i++){
			if(ch[i]==ch[i+3] && ch[i+3]==ch[i+6]) return ch[i];
		}
		i=0;
		if(ch[i]==ch[i+4] && ch[i+4]==ch[i+8]) return ch[i];
		i=2;
		if(ch[i]==ch[i+2] && ch[i+2]==ch[i+4]) return ch[i];	
		return 'd';
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			char ch[]=str.toCharArray();
			char ans=check(ch);
			if(ans=='s') ans='d';
			System.out.println(ans);
		}
	}
}