import java.util.*;
public class Main{
	public static boolean[] num=new boolean[10];
	public static int check(int a,int b,int c){
		if(b<0){
			return 0;
		}
		else if(a==1){
			if(b<10){
				if(num[b]==true&&b>c){
					return 1;
				}
				else{
					return 0;
				}
			}
			else{
				return 0;
			}
		}
		else{
			int tmp=0;
			for(int i=0;i<=9;i++){
				if(num[i]==true&&i>c){
					num[i]=false;
					tmp+=check(a-1,b-i,i);
					num[i]=true;
				}
			}
			return tmp;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			num[i]=true;
		}
		int n,s;
		while(true){
			n=sc.nextInt();
			s=sc.nextInt();
			if(n!=0||s!=0){
				System.out.println(check(n,s,-1));
			}
			else{
				break;
			}
		}
	}
}
