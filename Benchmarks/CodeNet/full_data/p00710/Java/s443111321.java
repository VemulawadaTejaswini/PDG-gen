import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	 int n;
	 int w;
	 int sta;
	 int shufnum;
	 ArrayList<Integer> ar = new ArrayList<Integer>();
	 Scanner sc = new Scanner(System.in);
	 while(true){
		 n = sc.nextInt();
		 w = sc.nextInt();
		 if(n==0&&w==0){
			 break;
		 }
		 int[] card = new int[n];
		 int[] cardnumber = new int[n];
		 int[] tmp = new int[n];
		 for(int i=0;i<n;i++){
			 cardnumber[i] = i;
		 }
		 for(int k=0;k<w;k++){
		 sta = sc.nextInt();
		 shufnum = sc.nextInt();
		for(int i=0;i<shufnum;i++){
		tmp[i] = cardnumber[i];
		
		}
		for(int i=0;i<shufnum;i++){
			cardnumber[i]=cardnumber[sta-1+i];
		}
		for(int i=0;i<shufnum;i++){
			cardnumber[sta-1+i] = tmp[i];
		}
		 
	 }
		 ar.add(cardnumber[0]);
	 }
	for(int i=0;i<ar.size();i++){
		System.out.println(ar.get(i));
	}
	 
 }
}