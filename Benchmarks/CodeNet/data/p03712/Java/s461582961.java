import java.util.Scanner;

public class Main {
	  public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);

            int h = sc.nextInt();
            int w = sc.nextInt();
            String[] s = new String[h];
            for(int i = 0; i < h; i++){
                s[i] = sc.nextLine();
                s[i] = "#"+ s[i] +"#";
            }
            String sharp = "";
            for(int i = 0; i < w+2; i++){
                sharp = sharp + "#";
            }
            System.out.println(sharp);
            for(int i = 0; i < h; i++){
                System.out.println(s[i]);
            }
            System.out.println(sharp);
            sc.close();
		  }
}