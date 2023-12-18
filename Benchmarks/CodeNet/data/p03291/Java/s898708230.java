import java.util.*;

public class Main{
public static void main(String[] args){
long mod = 1000000007;
Scanner sc = new Scanner(System.in);
String S = sc.next();
int l = S.length();
long[] A = new long[l];
long[] AB = new long[l];
long[] ABC = new long[l];
for(int i=0; i<l; i++){
switch(S.charAt(i)){
case 'A': A[i]=A[i-1]+1; AB[i]=AB[i-1]; ABC[i]=ABC[i-1];
case 'B': A[i]=A[i-1]; AB[i]=AB[i-1]+A[i-1]; ABC[i]=ABC[i-1];
case 'C': A[i]=A[i-1]; AB[i]=AB[i-1]; ABC[i]=ABC[i-1]+AB[i-1];
case '?: A[i]=A[i-1]+1; AB[i]=AB[i-1]+A[i-1]; ABC[i]=ABC[i-1]+AB[i-1];
}
A[i]%=mod; AB[i]%=mod; ABC[i]%=mod;
}
System.out.println(ABC[l-1]);
return;
}
}