import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "keyence";
		int i,j;
		Boolean f=false;
		int count =0;	
		String data=sc.next();

		for(i=0;i<data.length();i++) {
			count =0;
			for(j=0;j<7;j++) {
					if(data.charAt(i+j)==ans.charAt(j))count++;
					else {
						int result = data.substring(i+j).indexOf(ans.substring(j));
						if (result != -1&&data.substring(i+j+result).length()==ans.substring(j).length()&&i==0) {
						    f=true;
						    break;
						} else {
						    break;
						}
					}
				}
				if(f||count==7) {
					break;
				}
		}
		if(f||count==7) {
			System.out.println("YSE");
		}else {
			System.out.println("NO");
			
		}
	}
}