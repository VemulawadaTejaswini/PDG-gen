import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int tri[] = new int[n];
  for(int j=0;j<n;j++){
	  for(int i=0;i<3;i++){
		  tri[i]=sc.nextInt();
	  }
	  Arrays.sort(tri);
	  String ans;
if((tri[0]*tri[0]+tri[1]*tri[1])==(tri[2]*tri[2]))
	ans="YES";
else ans="NO";
System.out.print(ans+"\n");
  
  }
      }
}