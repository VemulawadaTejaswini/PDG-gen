import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
      boolean b1 = false;		//奇数文字
      boolean b2 = false;		//偶数文字
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      int mojilen = n.length();
      String[] strArray = n.split("");
      //判定
      for(int i=0;i<mojilen;i++) {
       		if (Math.abs(i+1) % 2 == 0) {
            //偶数文字
              switch (strArray[i]) {
        		case "L":
            	b2 = true;
            	break;
        		case "U":
            	b2 = true;
            	break;
       			case "D":
            	b2 = true;
            	break;
        		default:
           		b2 = false;
              }
        }
        else {
          	//奇数文字
                switch (strArray[i]) {
        		case "R":
            	b1 = true;
            	break;
        		case "U":
            	b1 = true;
            	break;
       			case "D":
            	b1 = true;
            	break;
        		default:
           		b1 = false;
        		}
       }
      }
      if (b1 == true && b2 == true){
       System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}