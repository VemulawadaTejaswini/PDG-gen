import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int cnt = sc.nextInt();
        int a[]= new int[cnt];
        int sigcnt =0;
      String answer = "YES";
        for(int i=0 ; i<cnt ; i++){
         a[i]=sc.nextInt(); 
        }
        for(int i=0 ; i<cnt ; i++){
         if(a[i]!=i+1){
           sigcnt++;
         }
         if(sigcnt>2){
           answer="NO";
           break;
         }
        }

		System.out.println(answer);

	}
}
