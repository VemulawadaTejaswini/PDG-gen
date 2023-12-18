import java.util.Scanner;

class Main{
	public static String shiftChar(int num, String str){
    	char[] ch = str.toCharArray();
      int length = ch.length;
      int temp = 0;
      char ch = '0';
      String result = "";
      
      for(int i = 0;i< length; i++){
      	int input = ch[i];
        int value = input + num;
        if(value > 90){
        	temp = value - 90+ 65;
          ch = (char)temp;
          result += ch;
        }else{
        	ch = (char)value;
          result += ch;
        }
      }
      return result;
    }
  public static void main(String[] agrs){
  	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = sc.next();
    System.out.println(shiftChar(num,str));
  }
}