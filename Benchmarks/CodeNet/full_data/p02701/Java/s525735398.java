import java.util.Scanner;

class Main{
      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  String[][] items = new String['w'-'A'][n];
	  int count = 0;
	  for(int i=0;i<n;i++){
	      String text = sc.next();
	      int index;
	      char c = text.charAt(0);
	      index = c-'A';
	      for(int j=0;j<items[index].length;j++){
		  if(items[index][j]==null){
		      items[index][j] = text.toString();
		      count++;
		      break;
		  }
		  if(items[index][j].equals(text)){
		      break;
		  }
	      }
	  }
	  System.out.println(count);
      }
}
