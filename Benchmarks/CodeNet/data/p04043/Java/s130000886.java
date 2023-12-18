public class Main{
	public static void main(String[]args) {
		String judg=null;
		int[]number=new int[3];
		for(int i=0;i<3;i++) {
			number[i]=new java.util.Scanner(System.in).nextInt();
		}
		if((number[0]==5&&number[1]==5&&number[2]==7)||(number[0]==5&&number[1]==7&&number[2]==5)||(number[0]==7&&number[1]==5&&number[2]==5)) {
			judg="YES";
		}else{
			judg="NO";
		}
		System.out.println(judg);
	}
}