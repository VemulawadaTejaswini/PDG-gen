import java.util.*;

public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
double ar = Math.sqrt(a);
//System.out.println(ar);
double br = Math.sqrt(b);
//System.out.println(br);
int cr = c-a-b;
//System.out.println(cr);
double ab = (ar*br);
//System.out.println(ab);
int abi = (int)ab;
//System.out.println(abi);
if ((2*abi)<=cr){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
}


