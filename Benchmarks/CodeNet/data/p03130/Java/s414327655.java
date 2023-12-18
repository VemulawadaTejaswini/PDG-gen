import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int[] a = new int[6];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	String ans = "YES";
      	for(int i=0; i<a.length; i++){
			if(a[i]==1){
              count1++;
              if(count1>=3) ans = "NO";
            }
          	if(a[i]==2){
              count2++;
              if(count2>=3) ans = "NO";
            }
          	if(a[i]==3){
              count3++;
              if(count3>=3) ans = "NO";
            }
          	if(a[i]==4){
              count4++;
              if(count4>=3) ans = "NO";
            }
		}
      	System.out.println(ans); 	
	}
}