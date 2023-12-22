import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		while(true){
			String W =sc.next();
			if(W.equals("-")) break;
			int m=sc.nextInt();
			int count=0;
			for(int i=0;i<m;i++)
				count+=sc.nextInt();
			for(int i=0;i<W.length();i++)
				System.out.print(W.charAt((count+i)%W.length()));
			System.out.println();
		}
	}

}
