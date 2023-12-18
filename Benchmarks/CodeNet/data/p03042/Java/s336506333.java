import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
        int n[] = new int[2];
        int d = 100;
      
     for (int i = 0; i < 2; i++) {n[i]=(S/d);S%=d;d/=100;}
     if(n[1]>00&&n[1]<13){
        if(n[0]>00&&n[0]<13){System.out.print("AMBIGUOUS");}
       else{System.out.print("YYMM");}
     }
     else if(n[0]>00&&n[0]<13){System.out.print("MMYY");}
     else{System.out.print("NA");}
      

	}
}
