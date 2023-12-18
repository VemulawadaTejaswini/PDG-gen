import java.util.Scanner;
public class Main {
	private int i=100100;
	private int four=0,two=0,one=0;
	private long a[] =new long[i];
	private String b[] =new String[i];
	public static void main(String[] args) {
		Main c=new Main();
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		c.read_in(n);
		c.check();
	}
	public void read_in(int n){
		Scanner sc =new Scanner (System.in);	
			String str=sc.nextLine();
			String[] temp=str.trim().split(" ");
		for(i=0;i<n;i++){
			a[i]= Integer.parseInt(temp[i]);
			if(a[i]%4==0){
				four++;
			}
			else if(a[i]%2==0){
				two++;
			}
			else	one++;
		}
	}
	public void check(){
		 if(one>four+1||(one==four+1&&two!=0)) System.out.print("No\n");
	        else System.out.print("Yes\n");
	}
}