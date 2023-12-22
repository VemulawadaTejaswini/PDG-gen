import java.io.*;
import java.util.*;

class Main{

     static final int N = 4;

  public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String str = br.readLine();

     String[] strAry = str.split(" ");

     System.out.println(strAry.length);

     boolean validated = false;
    
     while(!validated){
     
     if(strAry.length > N){
       System.out.println("too large");
       validated = true;
       } else{
       validated = false;
       }
       } 
     int ar[] = new int[N];
    
   
     for(int i=0;i<strAry.length;i++){
	ar[i] = Integer.parseInt(strAry[i]);
     }

    for(int j=0;j<N;j++){
    if(ar[j]<1){
	break;
     }
     else{
        System.out.println("Case " + j + ":" +ar[j]);
     }

     }
    
     
}

}