import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    if(b - a + 1 <= k * 2){
      for(int i = a; i <= b; i++){System.out.println(i);}
    }else{
      for(int i = a; i <= a+k-1; i++){
        System.out.println(i);
      }
      for(int j = b-k+1; j <= b; j++){
        System.out.println(j);
      }
    }
    
  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
