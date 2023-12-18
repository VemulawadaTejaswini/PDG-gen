import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
int[] a={1,3,5,7,8,10,12};
int[] b={4,6,9,11};
int c1=0,c2=0;
    for (int i = 0; i < 7; i++) {
        if(a[i]==x)c1++;
        if(a[i]==y)c1++;
        if(i<4){
            if(b[i]==x)c2++;
            if(b[i]==y)c2++;
        }
        
    }
    if(c1==2||c2==2){out.println("Yes");
    }else{out.println("No");}
}
}