import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			 int N = scan.nextInt();
			 int M = scan.nextInt();
			 int dame = 0;
			 
			 int[] s = new int[M];
			 int[] c = new int[M];
			 
			 for(int i = 0;i<M;i++) {
				 s[i] = scan.nextInt();
			     c[i] = scan.nextInt();
			 }
			 
			 int[] ketasuu = new int[N];
			 for(int i = 0;i<N;i++) {
				 ketasuu[i] = -1;//何も入っていない証明
			 }
			 
			 
			 
			 for(int i = 0;i<M;i++) {
				 if(ketasuu[s[i]-1]==-1){//桁に何も履いていなかったら入れる
					 ketasuu[s[i]-1]=c[i];
				 }
				 if(ketasuu[s[i]-1]!=-1&&ketasuu[s[i]-1]!=c[i]){//数字が入っているのに指定されてる数字が違う
					 dame = 1;
					 break;
				 }
			 }
			 
			 StringBuffer sb = new StringBuffer();
			 
			 for(int i = 0;i<N;i++) {
				 if(ketasuu[i] == -1) {
					 ketasuu[i]=0;
				 }
				 sb.append(String.valueOf(ketasuu[i])); 
			 }
			 if(M==0) {
				 System.out.println(0);
			 }else if(ketasuu[0]==0) {
				 System.out.println(-1);
			 }else if(dame ==1){
				 System.out.println(-1);
			 }else {
				 System.out.println(sb.toString());
			 }
			
			
			
			
			
			
			
			
			
		}	
	}
}
