import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int count = 0;
    String s1 = s.replaceAll("ABC", "-");

    for(int i=0;i<s1.length();i++) {
    	if(s1.charAt(i)=='-') {
    		count += 1;
    	}
    }
    System.out.println(count);
  }
}