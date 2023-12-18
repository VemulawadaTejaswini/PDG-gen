import java.util.*;

public class Main {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int i;
for(i = 1; i < N; i++){
    int pow = pow * i;
    double ans = (double)pow % (Math.pow(10.0,9.0)+7.0);
}
System.out.println((int)ans);

    }
}
