import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		String[] sca=new String[3];
		for(int i=0; i<3; i++) {
			sca[i]="";
			sca[i]=(sc.next()).charAt(i)+"";
		}
		System.out.println(sca[0]+sca[1]+sca[2]);
	}
}