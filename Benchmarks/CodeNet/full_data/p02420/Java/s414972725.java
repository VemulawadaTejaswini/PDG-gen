import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(true){
				 String str = scan.next();
				 if(str.equals("-"))break;
				 int n = scan.nextInt();
				 for(int i = 0 ;i < n;i++){
					 int data = scan.nextInt();
					 str = str.substring(data,str.length()) + str.substring(0,data);
				 }
				 System.out.println(str);
			}
		}finally{
			if(scan!=null)scan.close();
		}
	}
}