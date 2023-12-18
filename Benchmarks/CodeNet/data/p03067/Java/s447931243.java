import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
       	int C = Integer.parseInt(sc.next());
      	int min = Math.min(A,B);
      	int  max = Math.max(A,B);
      	if ((min <= C) && (C <= max)) System.out.println("Yes");
      	else System.out.println("No");
    }
}