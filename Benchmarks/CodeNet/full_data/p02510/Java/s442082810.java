import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			String data=sc.next();
			if(data.endsWith("-"))break;
			int count=sc.nextInt();
			for(int i=0;i<count;i++){
				int index=sc.nextInt();
				String a=data.substring(0,index);
				String b=data.substring(index);
				data=b+a;
			}
			System.out.println(data);
		}
	}
}