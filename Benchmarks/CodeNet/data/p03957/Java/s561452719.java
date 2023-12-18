import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
		char[] c = s.toCharArray();
		int count = 0;
		if (s.length()<2||s.length()>100){
			System.out.println("No");
		}
		else{
			for (int i=0;i<c.length;i++){
				if (count==0&&c[i]==67){
					count++;
				}
				else if(count==1&&c[i]==70){
					count++;
				}
			}
			if (count==2){
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
		
	}

}