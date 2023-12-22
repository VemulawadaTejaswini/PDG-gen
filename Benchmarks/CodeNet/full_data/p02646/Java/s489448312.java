import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Integer a = Integer.parseInt(sn.next());
        Integer v = Integer.parseInt(sn.next());
        Integer b = Integer.parseInt(sn.next());
        Integer w = Integer.parseInt(sn.next());
        Integer t = Integer.parseInt(sn.next());

        if ((a + v * t) >= (b + w * t)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
	}
}

