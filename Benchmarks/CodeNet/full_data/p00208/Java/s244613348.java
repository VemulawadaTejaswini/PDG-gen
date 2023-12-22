import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan =  null;
		try{
			scan = new Scanner(System.in);
			int n;

			while((n =scan.nextInt())!= 0){
				int k=1;
				int i;
				String s;
				for(i = 1 ;k !=n;i++){
					s = String.valueOf(i + 1);
					if(s.matches(".*[46].*")){
						continue;
					}else
						k++;
				}
				System.out.println(i);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}