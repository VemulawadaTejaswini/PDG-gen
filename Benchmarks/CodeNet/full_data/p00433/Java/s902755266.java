import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[] student = new int[2];
			for(int i = 0 ;i < 8;i++){
				if(i /4 == 0)
					student[0] +=scan.nextInt();
				else
					student[1] += scan.nextInt();
			}
			System.out.println(Math.max(student[0], student[1]));
		}finally{
			if(scan !=null) scan.close();
		}
	}
}