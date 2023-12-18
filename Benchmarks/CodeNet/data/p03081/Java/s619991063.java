import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q =sc.nextInt();
		String s=sc.next();
		char[][] p=new char[q][2];
		for(int i=0; i<q; i++){
			String t=sc.next();
			p[i][0]=t.charAt(0);
			String k=sc.next();
			p[i][1]=k.charAt(0);
		}
		int countl=-1;
		for(int i=q-1; i>=0; i--){
			if(p[i][1]=='L'){
				if(countl+1==n){
					System.out.println(0);
					return;
				}
				if(p[i][0]==s.charAt(countl+1)){
					countl++;
				}
			}else{
				if(countl!=-1 && p[i][0]==s.charAt(countl)){
					countl=Math.max(-1,countl-1);
				}
			}
		}
		int countr=n;
		for(int i=q-1; i>=0; i--){
			if(p[i][1]=='L'){
				if(countr!=n && p[i][0]==s.charAt(countr)){
					countr=Math.min(n,countr+1);
				}
			}else{
				if(countr-1==-1){
					System.out.println(0);
					return;
				}
				if(p[i][0]==s.charAt(countr-1)){
					countr--;
				}
			}
		}
	
		System.out.println(n-countl-1-(n-countr));
	}
}
