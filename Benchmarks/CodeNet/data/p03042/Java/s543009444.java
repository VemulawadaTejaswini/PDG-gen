import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
        int judge = 0;
        if(n%100>0 && n%100<=12){judge++;}
        if(n/100>0 && n/100<=12){judge+=2;}
		if(judge==0){System.out.println("NA");}
        if(judge==1){System.out.println("YYMM");}
        if(judge==2){System.out.println("MMYY");}
        if(judge==3){System.out.println("AMBIGUOUS");}
  }
}
