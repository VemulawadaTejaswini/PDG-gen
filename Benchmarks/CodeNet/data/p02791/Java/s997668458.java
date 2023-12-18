import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      int[] b = new int[a];
      int f = 0;
      int c=0;
      
      for(int i=0;i<a;i++){
               b[i] = sc.nextInt();
              }
      
      for(int j=0;j<a;j++){
        for(int k=0;k<=j;k++){
        
          if(b[j]<=b[k]){
            f = 1;
          } else {
            f=0;
            break;
          }
        }
        if(f==1){
          c++;
        }
          
      
      }
      System.out.println(c);
 
 
		sc.close();
	}
}