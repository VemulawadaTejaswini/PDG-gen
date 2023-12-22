import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		int h=0;
		int m=0;
		int s=0;
		while(true){
			if(S>=3600){
				h++;
				S-=3600;
			}else if(S>=60){
				m++;
				S-=60;
			}else{
				s=S;
				break;
			}
		}
		String msg=h+":"+m+":"+s;
		System.out.println(msg);
	}
}
