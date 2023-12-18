import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
        int flag1 = 0;int flag2 = 0;
        int n[] = new int[2];
        int d = 100;
      
     for (int i = 0; i < 2; i++) {n[i]=(S/d);S%=d;d/=100;}
     if(n[0]<20){if(n[1]>00&&n[1]<13){flag1=1;}}
     if(n[0]>00&&n[0]<13){if(n[1]<20){flag2=1;}}
      
     if(flag1==1&&flag2==1){System.out.print("AMBIGUOUS");}
     else if(flag1 == 1){System.out.print("YYMM");}
     else if(flag2 == 1){System.out.print("MMYY");}
     else {System.out.print("NA");}
      

	}
}
