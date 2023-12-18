import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long a=0,b=0,c=0,d=0,e=0;
    for(int i=0;i<n;i++){
        String str = sc.next();
        switch(str.charAt(0)){
            case 'M': a++; break;
            case 'A': b++; break;
            case 'R': c++; break;
            case 'C': d++; break;
            case 'H': e++; break;
        }
    }
    System.out.println(
a*b*c + 
a*b*d + 
a*b*e + 
a*c*d + 
a*c*e + 
a*d*e + 
b*c*d + 
b*c*e + 
b*d*e + 
c*d*e);
  }
}
