import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner kbs=new Scanner(System.in);
	int N = kbs.nextInt();
	int a=0;
	String s = kbs.next();
	String t = kbs.next();
	for(int i=0;i<N;i++){
		for(int j=N-1;j>-1;j--){
		if(s.charAt(i)==t.charAt(j)){
			for(;i<N;i++){
				if(j==0){
					break;
				}
				j--;
				if(s.charAt(i)==t.charAt(j)){
					a++;
				}else{
					break;
				}
			}
			a++;
		}
		}
	}
	System.out.println(2*N-a);
	
	}
		
}
