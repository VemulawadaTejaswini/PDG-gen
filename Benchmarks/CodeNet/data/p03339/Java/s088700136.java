import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] str=sc.nextLine().split("");
		int cntE=0,cntW=0,cnt=300000;
		for(int i=0;i<str.length;i++){
			if(str[i].equals("E"))cntE=cntE+1;
			if(str[i].equals("W"))cntW=cntW+1;
		}
		int leftE=0,leftW=0;
		for(int i=0;i<str.length;i++){
			if(cnt>(leftW+cntE-leftE))cnt=(leftW+cntE-leftE);
			if(str[i].equals("E"))leftE=leftE+1;
			if(str[i].equals("W"))leftW=leftW+1;
		}
		System.out.println(cnt);
	}
}
