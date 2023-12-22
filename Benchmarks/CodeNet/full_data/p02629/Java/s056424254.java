import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long N = sc.nextLong();
    String name="";
    sc.close();
    int a=1,pow[]=new int[30];
    pow[0]=26;

    while(pow[a-1] < N){
    	a++;
    	pow[a-1] = (int)Math.pow(26, a);
    }
    char c;
    while(a!=1) {
    	a--;
	    c = (char)(96+N/pow[a-1]);
    	N = N%pow[a-1];
    	name = name.concat(Character.toString(c));
    }

	name = name.concat(Character.toString((char)(96+N%26)));
    System.out.println(name);
  }
}