import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      int[] b = new int[a];
      int f = 0;
      int c=1;
      
      for(int i=0;i<a;i++){
               b[i] = sc.nextInt();
              }

      for(int j=0;j<a-1;j++){
        
          if(b[j]>b[j+1]){
            c++;
          } 
        }

      System.out.println(c);
 
 
		sc.close();
	}
}