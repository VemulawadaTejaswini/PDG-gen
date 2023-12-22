import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s=in.next();
        int k=in.nextInt();
        while(!s.equals("-")){
    		StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<k;i++){
                int h=in.nextInt();
                sb.append(sb.substring(0,h));
                sb.delete(0, h);
            }
            System.out.println(sb);
    		s=in.next();
            k=in.nextInt();
        }
	}
}