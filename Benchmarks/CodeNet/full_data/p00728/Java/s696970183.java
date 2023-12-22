import java.util.*;
 
public class Main {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(),max=0,min=1000,seiseki=0,sum = 0;
 
do{
    int s[] = new int [n];
     
    for (int i = 0;i == n;i++){
        s[i] = scan.nextInt();
        sum = sum + s[i];
 
        if(max<s[i]){
            max = s[i];
        }
 
        if(min>s[i]){
            min = s[i];
        }
    }
    seiseki = sum - (max + min) / (n - 2);
    System.out.println(seiseki);
    n = scan.nextInt();
} while(n == 0);
}
}