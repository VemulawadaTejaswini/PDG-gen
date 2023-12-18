import java.util.Scanner;
import java.util.ArrayList;

class Main{
      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  String[] items = new String[n];
	  for(int i=0;i<n;i++){
	      items[i] = sc.next();
	  }
	  ArrayList<String> itemList = new ArrayList<>();
	  for(int i=0;i<n;i++){
	      if(itemList.size()>=1){
		  for(int j=0;j<itemList.size();j++){
		      if(items[i].equals(itemList.get(j))){
			  break;
		      }else if(j==itemList.size()-1){
			  itemList.add(items[i]);
		      }
		  }
	      }else{
		  itemList.add(items[i]);
	      }
	  }
	  System.out.println(itemList.size());
      }
}
