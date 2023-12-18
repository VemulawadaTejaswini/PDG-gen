import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int temp=n-999;
if(n<=999){System.out.println("ABC"+n);}else{
System.out.println("ABD"+temp);
}
}
}