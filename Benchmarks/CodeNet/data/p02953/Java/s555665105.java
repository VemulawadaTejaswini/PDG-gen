import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        
        int smallest = 0;
        int first = scan.nextInt();
      for (int i=1;i<n;i++){
        int next = scan.nextInt();
        if(first<next){
          smallest = next-1;
          first=next;
          continue;
        }else if(first==next){
          continue;
        }else{
          if(first-1>next|| first==smallest){
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
	}
}