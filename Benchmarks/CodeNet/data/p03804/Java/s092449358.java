import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      InputStream inputStream = System.in;
      OutputStream outputStream = System.out;
      Scanner sc = new Scanner(inputStream);
      PrintWriter out = new PrintWriter(outputStream);
	  int N = Integer.parseInt(sc.next());
      int M = Integer.parseInt(sc.next());
      char A[][] = new char[50][50];
      for(int i = 0; i < N; i++){
      	String line = sc.next();
        for(int j = 0;j < N; j++){
        	A[i][j] = line.charAt(j);
        }
      }
      char B[][] = new char[50][50];
      for(int i = 0; i < M; i++){
      	String line = sc.next();
        for(int j = 0;j < M; j++){
        	B[i][j] = line.charAt(j);
        }
      }
      boolean match = true;
      loop1:for(int ly = 0;ly < N; ly++){
		loop2:for(int lx = 0; lx < N; lx++){
        	if(N <= ly + M - 1 || N <= lx + M - 1){ continue loop2; }
          	for(int y = 0;y < M; y++){
            	for(int x = 0;x < M; x++){
                	if(A[ly+y][lx+x] != B[y][x]){
                    	match = false;
                    }
                }
            }
           if(match){
              break loop1;
           }
        }      	
      }
      if(match){
      	out.println("Yes");
      }else{
      	out.println("No");
      }
      out.close();
    }
}