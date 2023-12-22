import java.util.Scanner;
public class Main {
	static int change(String letter){
		int n=0,a;
		for(int i=0;i<letter.length();i++){
			switch(letter.charAt(i)){
			case 'A':
				a=0;
				break;
			case 'C':
				a=1;
				break;
			case 'G':
				a=2;
				break;
			default:
				a=3;
				break;
			}
			n=n+a*(int)Math.pow(4, i);
		}
		return n;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean[] s1=new boolean[(int)Math.pow(4,1)];
		boolean[] s2=new boolean[(int)Math.pow(4,2)];
		boolean[] s3=new boolean[(int)Math.pow(4,3)];
		boolean[] s4=new boolean[(int)Math.pow(4,4)];
		boolean[] s5=new boolean[(int)Math.pow(4,5)];
		boolean[] s6=new boolean[(int)Math.pow(4,6)];
		boolean[] s7=new boolean[(int)Math.pow(4,7)];
		boolean[] s8=new boolean[(int)Math.pow(4,8)];
		boolean[] s9=new boolean[(int)Math.pow(4,9)];
		boolean[] s10=new boolean[(int)Math.pow(4,10)];
		boolean[] s11=new boolean[(int)Math.pow(4,11)];
		boolean[] s12=new boolean[(int)Math.pow(4,12)];
		int n=scan.nextInt();
		String command;
		for(int i=0;i<n;i++){
			command=scan.next();
			if(command.equals("insert")){
				command=scan.next();
				switch(command.length()){
				case 1:s1[change(command)]=true;break;
				case 2:s2[change(command)]=true;break;
				case 3:s3[change(command)]=true;break;
				case 4:s4[change(command)]=true;break;
				case 5:s5[change(command)]=true;break;
				case 6:s6[change(command)]=true;break;
				case 7:s7[change(command)]=true;break;
				case 8:s8[change(command)]=true;break;
				case 9:s9[change(command)]=true;break;
				case 10:s10[change(command)]=true;break;
				case 11:s11[change(command)]=true;break;
				case 12:s12[change(command)]=true;break;
				}
			}else{
				command=scan.next();
				switch(command.length()){
				case 1:
					if(s1[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 2:
					if(s2[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 3:
					if(s3[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 4:
					if(s4[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 5:
					if(s5[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 6:
					if(s6[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 7:
					if(s7[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 8:
					if(s8[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 9:
					if(s9[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 10:
					if(s10[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 11:
					if(s11[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				case 12:
					if(s12[change(command)]){
						System.out.println("yes");
					}
					else{
						System.out.println("no");
					}
					break;
				default:
					System.out.println("no");
					break;
				}
			}
		}

		scan.close();
	}
}