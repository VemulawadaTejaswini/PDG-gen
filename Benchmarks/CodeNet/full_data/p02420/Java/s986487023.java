import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		char[] s;
		char tmp;
		int m,h;
		while(true){
			s=scan.next().toCharArray();
			if(s[0]=='-') break;
			m=scan.nextInt();
			for(int i=0;i<m;i++){
				h=scan.nextInt();
				for(int j=0;j<h;j++){
					tmp=s[0];
					for(int k=0;k<s.length-1;k++){
						s[k]=s[k+1];
					}
					s[s.length-1]=tmp;
				}
			}
			for(int i=0;i<s.length;i++) System.out.print(s[i]);
			System.out.println();
		}
		scan.close();
	}
}