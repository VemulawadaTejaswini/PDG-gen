import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        String num=sc.nextLine();
        if(num.equals("-")) {
        	break;
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++) {
        	int h=sc.nextInt();
        	String head = num.substring(0,h);
        	String tail = num.substring(h);
        	num = tail + head;
        }
        System.out.println(num);
        }
        sc.close();
    }
}
