import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1行目は単語w
        String w = sc.nextLine();
        String sa = new String();
        int count=0;
        while(true){
        	sa = sc.next();
        	if("END_OF_TEXT".equals(sa)){
        		break;
        	}
        	if (w.equals(sa.toLowerCase())) {
        		count ++;
        	}
        }
        sc.close();
        System.out.println(count);
    }
}

