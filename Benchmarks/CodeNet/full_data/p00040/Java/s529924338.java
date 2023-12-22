import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean bool = false;
		String str[] = null;

		while(sc.hasNext()){
			str=sc.nextLine().split(" ");
			bool = false;
			for(int a=1;a<100;a++){
				if(1<gcd(a,26)) continue;
				for(int b=1;b<100;b++){
					for(int i=0;i<str.length;i++){
						char ch[]=str[i].toCharArray();
						for(int j=0;j<ch.length;j++){
							ch[j]=(char)(((ch[j]-'a')*a+b)%26+'a');
						}//for j
						str[i]=new String(ch);
						if(str[i].equals("this")||str[i].equals("that"))
							bool=true;
					}//for i
					if(bool) break;
				}//for b
				if(bool) break;
			}//for a


			boolean f=true;
			for(int i=0;i<str.length;i++){
				if(!f)System.out.print(" ");
				f=false;
				System.out.print(str[i]);
			}
			System.out.println();
		}
	}
	static int gcd(int m,int n){
		if(m<n){
			int temp=m;
			m=n;
			n=temp;
		}

		if(n==0) return m;

		int temp=n;
		n=m%n;
		m=temp;
		return gcd(m,n);
	}
}