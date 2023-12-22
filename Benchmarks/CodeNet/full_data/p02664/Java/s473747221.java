import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String []question = sc.nextLine().split(""); 

 		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < question.length; i++) {
          	String chr = question[i];
          	String target = "";
			if (chr.equals("?")) {
            	//最初の時
              	if (i == 0) {
                  if (question[i+1].equals("P")) {
                    ans.append("D");
                  }
                  else {
                    ans.append("P");
                  }
                }
              	//最後の時
              	else if ( i == question.length - 1) {
                    ans.append("D");
                }
              	else {
                  if (question[i-1].equals("P") || question[i+1].equals("P")) {
                    ans.append("D");
                  }
                  else {
                    ans.append("P");
                  }
                }
            }
          	else {
            	ans.append(chr);
            }
        }
        System.out.println(ans);
    }
}