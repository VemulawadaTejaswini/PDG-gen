import  java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int i,sum,ave,j=0;
        int d[] = new int[1000];
        String c[] = new String[100];
    try{  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        String line = in.readLine();
        int b = Integer.parseInt(line);
        if(b==0){
            break;
        }
        sum = 0;
        int a[] = new int[b];
      for(i=0;i<b;i++){
         c[i] = in.readLine();
         a[i] = Integer.parseInt(c[i]);
      }
     Arrays.sort(a);
      for(i=1;i<b-1;i++){
         sum += a[i];
      }
      ave = sum/(b-2);
      d[j] = ave;
      j++;
    }
    for(i=0;i<j;i++){
        System.out.println(d[i]);
    }
    } catch(IOException e) {
        System.out.println(e);
    } catch(NumberFormatException e){
        System.out.println(e);
    }
    }
  }
  

