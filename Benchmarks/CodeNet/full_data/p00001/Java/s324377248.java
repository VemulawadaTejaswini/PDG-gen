import java.io.*;
import java.util.*;
public class Main{
   public static void main(String[] args){
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int[] date = new int[10];
   for(int a = 0; a <= 9; a++){
   date[a] = Integer.parseInt(br.readLine());
   }
   int n = 10;
   int kari;
   for(int b = 0; b <= n-2; b++){
   int x = b;
   for(int c = b+1; c <= n-1; c++){
   if(date[x] < date[c]){
   x = c;
   }
   }
   if(x != b){
   kari = date[x];
   date[x] = date[b];
   date[b] = kari;
   }
   }
   for(int d = 0; d <= 2; d++){
   System.out.println(date[d]);
   }
   }
}
   