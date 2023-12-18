import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		int ic = sc.nextInt();
		int id = sc.nextInt();
		if((ia + ib) > (ic + id)){
			System.out.println("Left");
		}
		else if((ia + ib) == (ic + id)){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Right");
		}
    }
}
