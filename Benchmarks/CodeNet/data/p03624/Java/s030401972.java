import java.util.Scanner;

public class Main {
	  public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);

            String s  = sc.nextLine();
            String alp = "abcdefghijklmnopqrstuvwxyz";
            int count = 0;

            for(int i = 0; i < alp.length(); i++){
                if(s.indexOf(alp.substring(i,i+1)) == -1){
                    System.out.println(alp.substring(i,i+1));
                    count++;
                    break;
                }
                else{
                    continue;
                }
            }
            if(count == 0){
                System.out.println("None");
            }   

            sc.close();
		  }
}