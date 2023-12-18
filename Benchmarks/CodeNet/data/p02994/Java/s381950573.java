import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int l=sc.nextInt();
  System.out.println(((l>=0)?n*(n-1)/2+(n-1)*l:(n+l>=0)?n*(n+1)/2+n*(l-1):n*(n-1)/2+(n-1)*(l-1)));
}
}
