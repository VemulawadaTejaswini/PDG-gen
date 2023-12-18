import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String sin = sc.nextLine();
        int irt = 0;
		if(sin.charAt(0)=='1'){
			irt++;
		}
        if(sin.charAt(1)=='1'){
			irt++;
		}
        if(sin.charAt(2)=='1'){
			irt++;
		}
		System.out.println(irt);
    }
}
