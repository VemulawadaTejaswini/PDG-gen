import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
      
      	int maisu = 0;
      	int otsuri = 0;
      	if(n%1000==0) {
          System.out.println(0);
        } else {
          maisu = n / 1000 + 1;
          otsuri = maisu * 1000 - n;
          System.out.println(otsuri);
        }
    }
}