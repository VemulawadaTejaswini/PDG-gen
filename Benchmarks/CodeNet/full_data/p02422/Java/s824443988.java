import java.util.Scanner;
class Main {
	static String reverse(String target){
		String ret="";
		for(int i=target.length()-1;0<=i;i--){
			ret+=target.charAt(i);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int q=scan.nextInt();
		String cmd;
		int a,b;
		for(int i=0;i<q;i++){
			cmd=scan.next();
			if(cmd.equals("replace")){
				a=scan.nextInt();
				b=scan.nextInt();
				cmd=scan.next();
				str=str.replace(str.substring(a,b+1),cmd);
			}else if(cmd.equals("reverse")){
				a=scan.nextInt();
				b=scan.nextInt();
				String r=reverse(str.substring(a,b+1));
				cmd=str.substring(0,a);
				cmd+=r;
				cmd+=str.substring(b+1,str.length());
				str=cmd;
			}else{
				a=scan.nextInt();
				b=scan.nextInt();
				System.out.println(str.substring(a,b+1));
			}
		}
		scan.close();
	}

}