import java.util.*;
2.2. 
3.3.class Main{
4.4.  public static void main(String[] args){
5.5.    Scanner sc = new Scanner(System.in);
6.6.    String a = sc.next(); 
7.      int ans = 0;
8.  	int q = 0;
9.8     for(int i = 0; i < 3; i++){
10.9.      System.out.print(10 - Character.getNumericValue(a.charAt(i)));
11.10.    }
12.11.  }
13.12.}
