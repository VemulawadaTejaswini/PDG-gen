import java.util.Scanner;

class Main{
	static long f(String s){
		if(s.length()==1) return Long.valueOf(s);
		long sum=Long.valueOf(s);
		for(int i=1;i<s.length();i++){
			System.out.println(s.substring(0,i)+" "+s.substring(i));
			sum+=Long.valueOf(s.substring(0,i))*(long)(Math.pow(2,s.substring(i).length()-1))+f(s.substring(i));
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			System.out.println(f(s));
		}
	}
}