import java.util.Scanner;
import java.util.ArrayList;

class Main{
      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  String[] items = new String[n];
	  String[] lists = new String[n];
	  int index = 0;
	  for(int i=0;i<n;i++){
	      items[i] = sc.next();
	      if(i==0){
		  lists[0] = items[0];
		  index++;
	      }else{
		  for(int j=0;j<i;j++){
		      if(items[i].equals(lists[j])){
			  break;
		      }else if(j==i-1){
			  lists[index] = items[i];
			  index++;
		      }
		  }
	      }
	  }
	  System.out.println(index);
      }
}
