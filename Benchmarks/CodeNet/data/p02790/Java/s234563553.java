public class Main{
	public static void main(String[] args){
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		String str1="";
		if(a<b){
			for(int i = 0;i<b;i++)
			str1+=""+a;
		}else{
			for(int i = 0;i<=a;i++)
			str1 += ""+b;
		}
		System.out.println(str1);
		
	}
	
}