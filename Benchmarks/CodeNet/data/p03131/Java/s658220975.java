import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
long K = sc.nextLong();
long A = sc.nextLong();
long B = sc.nextLong();
long bis =1;
if((B-A)>=2){
    if(bis+K<=A){
        System.out.println(K+1);
    }else{
        K-=(A-1);
        bis += (A-1);
        long trade = K/2;
        bis += trade*(B-A);
        if(K%2==1) bis += 1;
        System.out.println(bis);
    }
}else{
    System.out.println(K+1);
}

}
}
