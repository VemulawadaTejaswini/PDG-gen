import java.util.Scanner;


class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    while(true){
      int N = sc.nextInt();

      if(N == 0){
	break;
      }

      char replaces[] = new char[256];
      
      for(int i = 0; i < N; i++){
	replaces[sc.next().toCharArray()[0]] = sc.next().toCharArray()[0];
      }

      long M = sc.nextLong();

      for(long i = 0; i < M; i++){
	char c = sc.next().toCharArray()[0];
	System.out.print(replaces[c] != 0 ? replaces[c] : c);
      }
      System.out.println();
    } 
  }
}