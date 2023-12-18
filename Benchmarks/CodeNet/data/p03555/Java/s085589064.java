import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		char[] x = sc.next().toCharArray();
		char[] y = sc.next().toCharArray();
		if (x[0]==y[2]){
        	if (x[2]==y[0]){
				if (x[1]==y[1]){
                	System.out.print("YES");
					return;
                }
            }
        }
		System.out.print("NO");
    }
}