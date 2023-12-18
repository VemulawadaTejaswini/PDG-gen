import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
                String ret = "NO";
                if(line1.charAt(0)==line2.charAt(2)){
                    if(line1.charAt(2)==line2.charAt(0)){
                        ret = "YES";
                    }
                }
		System.out.println(ret);
    }
}
