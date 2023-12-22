import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
int low = 1000;
int m = n%low;

int r = 1000-m;

System.out.println(r);

}
}