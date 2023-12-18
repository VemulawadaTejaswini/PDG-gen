import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int vert = sc.nextInt();
      	int hori = sc.nextInt();
      	
      	System.out.println((vert * hori) -
                          ((vert + hori) - 1));
    }
}