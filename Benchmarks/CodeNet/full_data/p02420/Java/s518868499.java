import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        String num=sc.nextLine();
        if(num.equals("-")) {
        	break;
        }
        int m=Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++) {
        	int h=Integer.parseInt(sc.nextLine());
        	String head = num.substring(0,h);
        	String tail = num.substring(h);
        	num = tail + head;
        }
        System.out.printf("%s\n", num);
        }
        sc.close();
    }
}
