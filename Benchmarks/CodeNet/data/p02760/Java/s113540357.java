package indent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        String line1 = sc.nextLine();
        String num1 = line1.substring(0,line1.indexOf(" "));
        String num2 = num1.substring(0,line1.indexOf(" "));
        String num3 = num2.substring(0,line1.indexOf(" "));
        String line2 = sc.nextLine();
        String num4 = line2.substring(0,line2.indexOf(" "));
        String num5 = num4.substring(0,line2.indexOf(" "));
        String num6 = num5.substring(0,line2.indexOf(" "));
        String line3 = sc.nextLine();
        String num7 = line3.substring(0,line3.indexOf(" "));
        String num8 = num7.substring(0,line3.indexOf(" "));
        String num9 = num8.substring(0,line3.indexOf(" "));

        // ArrayList<String> input = new ArrayList<String>();
        // 入力をすべて受け取る
        while(sc.hasNextLine()){
         String inta = sc.nextLine();
        //   if(inta.equals(null)){
        //       break;
        //   }
         	if(inta == num1) {
         		num1 = "check";
         	}
         	if(inta == num2) {
         		num2 = "check";
         	}
         	if(inta == num3) {
         		num3 = "check";
         	}
         	if(inta == num4) {
         		num4 = "check";
         	}
         	if(inta == num5) {
         		num5 = "check";
         	}
         	if(inta == num6) {
         		num6 = "check";
         	}
         	if(inta == num7) {
         		num7 = "check";
         	}
         	if(inta == num7) {
         		num7 = "check";
         	}
         	if(inta == num8) {
         		num8 = "check";
         	}
         	if(inta == num9) {
         		num9 = "check";
         	}
        }
        if(num1.equals("check") && num2.equals("check") && num3.equals("check")) {
        	System.out.println("Yes");
        } else if(num1.equals("check") && num4.equals("check") && num7.equals("check")) {
        	System.out.println("Yes");
        } else if(num1.equals("check") && num5.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        } else if(num2.equals("check") && num5.equals("check") && num8.equals("check")) {
        	System.out.println("Yes");
        } else if(num3.equals("check") && num5.equals("check") && num7.equals("check")) {
        	System.out.println("Yes");
        } else if(num3.equals("check") && num6.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        } else if(num4.equals("check") && num5.equals("check") && num6.equals("check")) {
        	System.out.println("Yes");
        } else if(num7.equals("check") && num8.equals("check") && num9.equals("check")) {
        	System.out.println("Yes");
        }

}
}