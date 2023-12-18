import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		int ic = sc.nextInt();
		if(ia==ib){
			System.out.println(ic);
		}
		else if(ia==ic){
			System.out.println(ib);
		}
		else{
			System.out.println(ia);
		}
    }
}
