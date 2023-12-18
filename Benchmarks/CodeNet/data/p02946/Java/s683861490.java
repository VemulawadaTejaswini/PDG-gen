import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
        int za =  in.nextInt();
      
      if(nam>1){
      for(int i =za-(nam-1);i<za+nam;i++){
        System.out.print(i+" ");
      }
      	}else{System.out.print(za); }

      
	}
}
