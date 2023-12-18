import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		for(int i=0;i<ss.length();i++){
			if(i%2==1){
				continue;
			}
			System.out.print(ss.charAt(i));
		}
    }
}
