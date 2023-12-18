import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String out = "No";
        for (int c =0; c < 3; c++ ){
            if ((a * b * c) % 2 == 1){
                out = "Yes";
            	break;
            }
        }
        System.out.println(out);
    }
}