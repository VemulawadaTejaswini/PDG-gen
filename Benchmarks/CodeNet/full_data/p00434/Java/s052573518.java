import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			boolean[] student = new boolean[30];
			for(int i =0; i < 28;i++){
				student[scan.nextInt()] = true;
			}
			for(int i = 0; i < student.length;i++){
				if(!student[i])
					System.out.println(i);
			}
		}finally{
			if(scan !=null) scan.close();
		}
	}
}