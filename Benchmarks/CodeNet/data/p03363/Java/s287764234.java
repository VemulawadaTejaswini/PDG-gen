import java.util.ArrayList; 
import java.util.Scanner; 

public class Main { 
 public static void main(String[] args) { 

  Scanner sc = new Scanner(System.in); 
  int N = sc.nextInt(); 
  ArrayList<Integer> A = new ArrayList<>(N); 

  int count = 0; 
  int num = 0; 
  int j = 0; 
  int i = 0; 
  int n = N - 1; 
  int in = i - 1; 

  while(sc.hasNext()) { 
   A.add(sc.nextInt()); 
  } 

  for (i = 0; i + j < N;) { 

   if ((num = num + A.get(i + j)) == 0) 
    ++count; 
   if (i + j == n) { 
    ++j; 
    i = in; 
    num = 0; 
   } 
   ++i; 
  } 
  System.out.println(count); 
 } 
}